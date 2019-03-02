package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.InvalidSalaryValue;
import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.NoLettersInNameEcception;
import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.NoLettersInSurname;
import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.SetWrongLevelEnergy;

import java.util.Objects;

public abstract class Employee {

    protected int id = -1;
    protected double energy = 100; // range from 0 till 100
    protected String name;
    protected String surname;
    protected String positoin;
    protected double salary; // in human*hours
    protected double bonus;
    protected int payRange;
    protected int experience;

    {
        //    System.out.println("Hello from Employee initialization");
    }

    public Employee() {
        // System.out.println("Hello from Employee default constructor");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name, String surname, String positoin, double salary, double bonus, int payRange, int experience) {
        this.name = name;
        this.surname = surname;
        this.positoin = positoin;
        this.salary = salary;
        this.bonus = bonus;
        this.payRange = payRange;
        this.experience = experience;

        // System.out.println("Hello from Employee custom constructor");
    }

    public void work() {
        if (energy >= 10){
            System.out.println("Do some work");
            energy = getEnergy() - 100*0.1;
        }else {
            System.out.println("I am tired");
        }

    }
    public void relax() {
        if (energy <= 90){
            energy = getEnergy() + 100*0.1;
            System.out.println("Relax");
        }else {
            System.out.println("I need work");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NoLettersInNameEcception {
        if ((name != null) && (name.length() > 0)) {
            this.name = name;
        } else {
            throw new NoLettersInNameEcception("You haven't entered any letters");
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws NoLettersInSurname {

        if ((surname != null) && (surname.length() > 0)) {
            this.surname = surname;
        } else {
            throw new NoLettersInSurname("No entered letters in surname");
        }

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

    public void setSalary(double salary) throws InvalidSalaryValue {

        if (salary >= 0){
            this.salary = salary;
        }else throw new InvalidSalaryValue();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getPayRange() {
        return payRange;
    }

    public void setPayRange(int payRange) {
        this.payRange = payRange;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) throws SetWrongLevelEnergy {
        if ( (0<= energy) && (energy <= 100)){
            this.energy = energy;
        }else {
            throw new SetWrongLevelEnergy("Check value of energy. It must be from 0 till 100");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Double.compare(employee.bonus, bonus) == 0 &&
                payRange == employee.payRange &&
                experience == employee.experience &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(positoin, employee.positoin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, positoin, salary, bonus, payRange, experience);
    }

    @Override
    public String toString() {
        String[] className = this.getClass().getName().replace('.', ':').split(":");
        int indexNameOfClass = className.length - 1;

        return '{' + className[indexNameOfClass] +
                "[ id = " + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", positoin='" + positoin + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", payRange=" + payRange +
                ", experience=" + experience +
                " ]" +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", positoin='" + positoin + '\'' +
//                ", salary=" + salary +
//                ", bonus=" + bonus +
//                ", payRange=" + payRange +
//                ", experience=" + experience +
//                '}';
//    }
}
