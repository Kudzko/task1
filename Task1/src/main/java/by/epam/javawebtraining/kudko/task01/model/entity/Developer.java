package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;
import java.util.Objects;

/**
 * third level of abstraction
 */
public class Developer extends Inferior {
    private String position = "Junior";

    public Developer() {
    }

    public Developer(int id) {
        super(id);
    }

    public Developer(String name, String surname, double salary, double bonus, int payRange, int experience,
                     Manager chief, List<String> skills, String position) {
        super(name, surname, salary, bonus, payRange, experience, chief, skills);
        this.position = position;
    }


    public void setPositoin(TypePosition typePosition) {
        position = typePosition.position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return super.toString() + "position = " + position;
    }


   public enum TypePosition {
        JUNIOR("Junior"), MIDDLE("Middle"), SENIOR("Senior");
        String position;

        TypePosition(String position) {
            this.position = position;
        }

    }
}


