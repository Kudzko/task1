package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Inferior extends Employee {
    Manager chief;
    List<String> skills;

    {
       // System.out.println("Hello from Inferior initialization");
    }

    public Inferior() {
       // System.out.println("Hello from Inferior default constructor");
        skills = new ArrayList<>();
    }

    public Inferior(int id) {
        super(id);
        skills = new ArrayList<>();
    }

    public Inferior(String name, String surname, String positoin, double salary, double bonus, int payRange,
                    int experience, Manager chief, List<String> skills) {
        super(name, surname, positoin, salary, bonus, payRange, experience);
        this.chief = chief;
        this.skills = skills;

       // System.out.println("Hello from Inferior custom constructor");
    }

    @Override
    public void work() {
        super.work();
    }

    public void execute() {
        System.out.println("Do manager's orders");
    }

    public void addSkill(String skill){
        if((skill != null) && (!skill.isEmpty())) {
            skills.add(skill);
        }else {
            System.out.println("entered skill incorrect ( null or contains zero letters)");
        }


    }

    public Manager getChief() {
        return chief;
    }

    public void setChief(Manager chief) {
        this.chief = chief;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inferior)) return false;
        if (!super.equals(o)) return false;
        Inferior inferior = (Inferior) o;
        return Objects.equals(chief, inferior.chief) &&
                Objects.equals(skills, inferior.skills);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), chief, skills);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n      chief = " + chief.id +", " + chief.name + chief.surname +
                ",\n      skills = " + skills.toString() +
                ']' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Inferior{" +
//                "skills=" + skills +
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
