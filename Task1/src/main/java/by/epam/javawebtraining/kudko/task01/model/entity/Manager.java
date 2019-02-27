package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.Arrays;
import java.util.Objects;

public class Manager extends Employee {
    protected Inferior[] inferiors;
    protected Manager leader;

    {
        // System.out.println("Hello from Manager initialization");
        inferiors = new Inferior[10];
    }

    public Manager() {
        // System.out.println("Hello from Manager default constructor");
    }


    public Manager(String name, String surname, String positoin, double salary, double bonus, int payRange,
                   int experience, Inferior[] inferiors, Manager leader) {
        super(name, surname, positoin, salary, bonus, payRange, experience);
        this.inferiors = inferiors;
        this.leader = leader;

        // System.out.println("Hello from Manager custom constructor");
    }

    public void work() {
        System.out.println("Do some manager's work");
    }

    public void manage() {
        System.out.println("I am managing");
    }

    public Inferior[] getInferiors() {
        return inferiors;
    }

    public void setInferiors(Inferior[] inferiors) {
        this.inferiors = inferiors;
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
        return Arrays.equals(inferiors, manager.inferiors) &&
                Objects.equals(leader, manager.leader);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(super.hashCode(), leader);
        result = 31 * result + Arrays.hashCode(inferiors);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n inferiors=" + printInferiors() +
                ", leader=" + leader +
                " ]" +
                '}';
    }

    public String printInferiors() {
        StringBuilder inferiorsToString = new StringBuilder();
        inferiorsToString.append("\n ");
        for (int i = 0; i < inferiors.length; i++) {
            if (inferiors[i] != null) {
                inferiorsToString.append(inferiors[i].name);
                inferiorsToString.append(", ");
                inferiorsToString.append(inferiors[i].surname);
                inferiorsToString.append("; ");
            }

        }

        return inferiorsToString.toString();
    }


//    @Override
//    public String toString() {
//        return "Manager{" +
//                "inferiors=" + /*Arrays.toString(inferiors) +*/
//                ", leader=" + leader +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", positoin='" + positoin + '\'' +
//                ", salary=" + salary +
//                ", bonus=" + bonus +
//                ", payRange=" + payRange +
//                ", experience=" + experience +
//                '}';
//    }
}
