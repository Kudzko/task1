package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.ExitOutOfBoundException;

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
}
