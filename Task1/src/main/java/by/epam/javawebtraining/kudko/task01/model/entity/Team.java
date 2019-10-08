package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.ExitOutOfBoundOfTeamException;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    private Employee[] team; // I created storage here with array as demanded
    private int counter;
    private int defaultSize = 10; // default size of team

    {
        counter = -1;
    }

    public Team() {

        team = new Employee[defaultSize];
    }

    public Team(Employee[] department) {
        this.team = department;
    }


    public void addEmployee(Employee employee) {
        if (counter < team.length) {
            team[++counter] = employee;
        } else {

            Employee[] tempDepartment;
            tempDepartment = team;
            team = new Employee[team.length + defaultSize];

            for (int i = 0; i < tempDepartment.length; i++) {
                team[i] = tempDepartment[i];
            }

            team[++counter] = employee;

        }
    }

    public void addAllEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (counter < team.length) {
                team[++counter] = employee[i];
            } else {

                Employee[] tempDepartment;
                tempDepartment = team;
                team = new Employee[team.length + defaultSize];

                for (int j = 0; j < tempDepartment.length; j++) {
                    team[j] = tempDepartment[j];
                }

                team[++counter] = employee[i];
                            }
        }
    }

    public Employee getEmployee(int i) throws ExitOutOfBoundOfTeamException {

        if (i >= team.length) {
            throw new ExitOutOfBoundOfTeamException();
        }
        return team[i];
    }

    public Employee[] getWholeTeam() {
        return team;
    }

    public void deleteEmployee(int i) throws ExitOutOfBoundOfTeamException {

        if (i >= team.length) {
            throw new ExitOutOfBoundOfTeamException();
        }
        team[i] = null;
        counter--;
        Employee tmpEmployee = team[i];
        for (int j = i; j < team.length; j++) {
            team[j] = team[j + 1];
            team[j + 1] = tmpEmployee;
        }
    }

    public void deleteAllEmployee() {
        for (int i = 0; i < team.length; i++) {
            team[i] = null;
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        if ((team != null) && (team.length != 0)) {
            this.team = team;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team1 = (Team) o;
        return counter == team1.counter &&
                Arrays.equals(team, team1.team);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(counter);
        result = 31 * result + Arrays.hashCode(team);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team =" + TeamToString() +
                ", counter=" + counter +
                '}';
    }


    private String TeamToString() {
        StringBuilder teamToString = new StringBuilder();
        teamToString.append("       Team : \n");
        for (Employee employee : team) {
            teamToString.append("       id = " + employee.getId() + ", ");
            teamToString.append(" name = " + employee.getName() + ", ");
            teamToString.append(" surname = " + employee.getSurname() + ", ");
        }

        return teamToString.toString();
    }
}
