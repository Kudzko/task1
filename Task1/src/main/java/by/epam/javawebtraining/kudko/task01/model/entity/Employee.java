package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.Objects;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected String positoin;
    protected double salary;

    {
        System.out.println("Hello from Employee initialization");
    }

    public Employee() {
        System.out.println("Hello from Employee default constructor");
    }

    public Employee(String name, String surname, String positoin, double salary) {

        System.out.println("Hello from Employee custom constructor");

        this.name = name;
        this.surname = surname;
        this.positoin = positoin;
        this.salary = salary;
    }

    public void work(){
        System.out.println("Do some work");
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPositoin() {
        return positoin;
    }

    public void setPositoin(String positoin) {
        this.positoin = positoin;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(positoin, employee.positoin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, positoin, salary);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", positoin='" + positoin + '\'' +
                ", salary=" + salary +
                '}';
    }
}
