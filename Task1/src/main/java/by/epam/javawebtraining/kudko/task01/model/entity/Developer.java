package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;

public class Developer extends Inferior {

    {
        System.out.println("Hello from initialisation block of Developer");
    }

    public Developer() {
        System.out.println("Hello from Developer default constructor");
    }

    public Developer(String name, String surname, String positoin, double salary, Manager chief, List<String> skills) {
        super(name, surname, positoin, salary, chief, skills);

        System.out.println("Hello from Developer custom constructor");
    }

    public void communicateWithCollegue(){
        System.out.println("Communicate with Tester");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "chief=" + chief +
                ", skills=" + skills + super.toString()+
                '}';
    }
}
