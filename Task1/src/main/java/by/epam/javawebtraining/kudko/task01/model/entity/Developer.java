package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;

public class Developer extends Inferior {
    private String position = "Junior";

    {
        // System.out.println("Hello from initialisation block of Developer");
    }

    public Developer() {
        // System.out.println("Hello from Developer default constructor");
    }

    public Developer(int id) {
        super(id);
    }

    public Developer(String name, String surname, double salary, double bonus, int payRange, int experience,
                     Manager chief, List<String> skills, String position) {
        super(name, surname, salary, bonus, payRange, experience, chief, skills);
        this.position = position;
    }

    public void changePositoin(TypePosition typePosition) {
        position = typePosition.position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + "position = " + position;
    }


}

enum TypePosition {
    JUNIOR("Junior"), MIDDLE("Middle"), SENIOR("Senior");
    String position;

    TypePosition(String position) {
        this.position = position;
    }

}
