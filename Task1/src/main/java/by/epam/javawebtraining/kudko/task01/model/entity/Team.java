package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.ExitOutOfBoundException;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    private Employee[] team; // I created storage here with array as demanded
    private int counter;

    {
        //System.out.println("Hello from Team initialization");
        counter = -1;
    }

    public Team() {

        team = new Employee[10];
        // System.out.println("Hello from Team default constructor");
    }

    public Team(Employee[] department) {
        this.team = department;
        // System.out.println("Hello from Team custom constructor");

    }

    public void addEmployee(Employee employee) {
        if (counter < team.length) {
            team[++counter] = employee;
        } else {
            System.out.println("team is full");
            Employee[] tempDepartment;
            tempDepartment = team;
            team = new Employee[team.length + 10];
            for (int i = 0; i < tempDepartment.length; i++) {
                team[i] = tempDepartment[i];
            }
            team[++counter] = employee;
            System.out.println("team is increased two times");
        }
    }

    public void addAllEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (counter < team.length) {
                team[++counter] = employee[i];
            } else {
                System.out.println("team is full");
                Employee[] tempDepartment;
                tempDepartment = team;
                team = new Employee[team.length + 10];
                for (int j = 0; j < tempDepartment.length; j++) {
                    team[j] = tempDepartment[j];
                }
                team[++counter] = employee[i];
                System.out.println("team is increased two times");
            }
        }
    }

    public Employee getEmployee(int i) throws ExitOutOfBoundException {
        if (i >= team.length) {
            throw new ExitOutOfBoundException();
        }
        return team[i];
    }

    public Employee[] getWholeTeam() {
        return team;
    }

    public void deleteEmployee(int i) throws ExitOutOfBoundException {
        if (i >= team.length) {
            throw new ExitOutOfBoundException();
        }
        team[i] = null;
        counter--;
        Employee tmpEmployee = team[i];
        for (int j = i; j < team.length; j++) {
            team[j] = team[j + 1];
            team[j + 1] = tmpEmployee;
        }
    }

    public void deleteAllEmployee(){
        for (int i = 0; i < team.length; i++) {
            team[i] = null;
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }

    public Employee[] getTeam() {
        return team;
    }

    public void setTeam(Employee[] team) {
        this.team = team;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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
                "team =" + printTeam() +
                ", counter=" + counter +
                '}';
    }


    private String printTeam(){
        StringBuilder teamPrinter = new StringBuilder();
        teamPrinter.append("       Team : \n");
        for (Employee employee : team){
            teamPrinter.append("       id = " + employee.getId() + ", ");
            teamPrinter.append(" name = " + employee.getName() + ", ");
            teamPrinter.append(" surname = " + employee.getSurname() + ", ");
        }

        return teamPrinter.toString();
    }
}
