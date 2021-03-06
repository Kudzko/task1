package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;
import java.util.Objects;

public class TeamLead extends Manager {
    private boolean controllingSomeTask = false;


    public TeamLead() {

    }

    public TeamLead(int id) {
        super(id);

    }

    public TeamLead(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience, List<Employee> employees, Manager leader, boolean controllingSomeTask) {
        super(id, energy, name, surname, salary, bonus, payRange, experience, employees, leader);
        this.controllingSomeTask = controllingSomeTask;
    }

    public TeamLead(TeamLead other) {
        super(other);
        this.controllingSomeTask = other.controllingSomeTask;
    }

    public void multytask(){
        controllingSomeTask = true;
    }

    public boolean isControllingSomeTask() {
        return controllingSomeTask;
    }

    public void setControllingSomeTask(boolean controllingSomeTask) {
        this.controllingSomeTask = controllingSomeTask;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        TeamLead teamLead = (TeamLead) o;
        return controllingSomeTask == teamLead.controllingSomeTask;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), controllingSomeTask);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     controllingSomeTask= " + controllingSomeTask +
                " ]" +
                '}';
    }

}
