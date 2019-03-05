package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Manager extends Employee {
    private List<Employee> employees;
    protected Manager leader;

    {
        // System.out.println("Hello from Manager initialization");
        employees = new ArrayList<>();
    }

    public Manager() {
        // System.out.println("Hello from Manager default constructor");
    }

    public Manager(int id) {
        super(id);
    }

    public Manager(String name, String surname, double salary, double bonus, int payRange, int experience,
                   List<Employee> employees, Manager leader) {
        super(name, surname, salary, bonus, payRange, experience);
        this.employees = employees;
        this.leader = leader;
        // System.out.println("Hello from Manager custom constructor");
    }

    @Override
    public void work() {
        if (energy >= 20){
            System.out.println("Do some work");
            energy = getEnergy() - 100*0.2;
        }else {
            System.out.println("I am tired");
        }
    }

    @Override
    public void relax() {
        if (energy <= 80){
            System.out.println("Chill");
            energy = getEnergy() + 100*0.2;
        }else {
            System.out.println("I need work");
        }
    }

    public void manage() {
        System.out.println("I am managing");
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Manager getLeader() {
        return leader;
    }

    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(employees, manager.employees) &&
                Objects.equals(leader, manager.leader);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), employees, leader);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     inferiors = " + printInferiors() +
                "\n     leader = " + leader +
                " ]" +
                "}\n";
    }

    public String printInferiors() {
        StringBuilder inferiorsToString = new StringBuilder();
        inferiorsToString.append("\n      ");
        for (Employee employee : employees) {
            if (employee != null) {
                inferiorsToString.append(employee.id);
                inferiorsToString.append(", ");
                inferiorsToString.append(employee.name);
                inferiorsToString.append(", ");
                inferiorsToString.append(employee.surname);
                inferiorsToString.append("; \n      ");
            }

        }

        return inferiorsToString.toString();
    }

}
