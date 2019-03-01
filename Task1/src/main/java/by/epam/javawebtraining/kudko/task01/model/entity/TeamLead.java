package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TeamLead extends Manager {
    private List<Employee> team;

    {
     //   System.out.println("Hello from initialisation block of TeamLead");
    }

    public TeamLead() {
        this.team = new ArrayList<Employee>();

     //   System.out.println("Hello from default constructor of TeamLead");
    }

    public TeamLead(int id) {
        super(id);
        this.team = new ArrayList<Employee>();
    }

    public TeamLead(String name, String surname, String positoin, double salary, double bonus, int payRange,
                    int experience, Inferior[] inferiors, Manager leader, List<Employee> team) {
        super(name, surname, positoin, salary, bonus, payRange, experience, inferiors, leader);
        this.team = team;

     //   System.out.println("Hello from custom constructor of TeamLead");
    }

    public void manageTeam(){
        System.out.println("Manage team");
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void setTeam(List<Employee> team) {
        this.team = team;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamLead)) return false;
        if (!super.equals(o)) return false;
        TeamLead teamLead = (TeamLead) o;
        return Objects.equals(team, teamLead.team);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), team);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     team=" + team +
                " ]" +
                '}';
    }


//    @Override
//    public String toString() {
//        return "TeamLead{" +
//                "team=" + team +
//                ", inferiors=" +/* Arrays.toString(inferiors) +*/
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
