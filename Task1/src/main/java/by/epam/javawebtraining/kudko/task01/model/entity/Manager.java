package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Manager extends Employee {
    Inferior[] inferiors;
    String Chief;

    {
        System.out.println("Hello from Manager initialization");
        inferiors = new Inferior[10];
    }

    public Manager() {
        System.out.println("Hello from Manager default constructor");
    }

    public Manager(String name, String surname, String positoin, double salary, Inferior[] inferiors, String chief) {
        super(name, surname, positoin, salary); // super always first line in constructor
        this.inferiors = inferiors;
        Chief = chief;

        System.out.println("Hello from Manager custom constructor");
    }

    public void manage(){
        System.out.println("Manage");

    }

    public Inferior[] getInferiors() {
        return inferiors;
    }

    public void setInferiors(Inferior[] inferiors) {
        this.inferiors = inferiors;
    }

    public String getChief() {
        return Chief;
    }

    public void setChief(String chief) {
        Chief = chief;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Arrays.equals(inferiors, manager.inferiors) &&
                Objects.equals(Chief, manager.Chief);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(super.hashCode(), Chief);
        result = 31 * result + Arrays.hashCode(inferiors);
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "inferiors=" + Arrays.toString(inferiors) +
                ", Chief='" + Chief + '\'' +
                super.toString();
    }
}
