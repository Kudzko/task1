package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Inferior extends Employee {
    String manager;
    Inferior [] colleague;

    {
        System.out.println("Hello from Inferior initialization");
        colleague = new  Inferior[10];
    }

    public Inferior() {
        System.out.println("Hello from Inferior default constructor");
    }

    public Inferior(String name, String surname, String positoin, double salary, String manager, Inferior[] colleague) {
        super(name, surname, positoin, salary);
        this.manager = manager;
        this.colleague = colleague;

        System.out.println("Hello from Inferior custom constructor");
    }

    public void learnNewTechnology(){
        System.out.println("Learn some new technologies");
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Inferior[] getColleague() {
        return colleague;
    }

    public void setColleague(Inferior[] colleague) {
        this.colleague = colleague;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Inferior inferior = (Inferior) o;
        return Objects.equals(manager, inferior.manager) &&
                Arrays.equals(colleague, inferior.colleague);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(super.hashCode(), manager);
        result = 31 * result + Arrays.hashCode(colleague);
        return result;
    }

    @Override
    public String toString() {
        return "Inferior{" +
                "manager='" + manager + '\'' +
                ", colleague=" + Arrays.toString(colleague) +
                super.toString();
    }
}
