package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;

public class Tester extends Inferior {
    {
       // System.out.println("Hello from initialisation block of Tester");
    }

    public Tester() {
        //System.out.println("Hello from Tester default constructor");
    }

    public Tester(int id) {
        super(id);
    }

    public Tester(String name, String surname, String positoin, double salary, double bonus, int payRange,
                  int experience, Manager chief, List<String> skills) {
        super(name, surname, positoin, salary, bonus, payRange, experience, chief, skills);

       // System.out.println("Hello from Tester custom constructor");
    }

    public void communicateWithCollegue(){
        System.out.println("Communicate with Developer");
    }

    @Override
    public String toString() {
        return super.toString();
    }


//    @Override
//    public String toString() {
//        return "Tester{" +
//                "chief=" + chief +
//                ", skills=" + skills +
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
