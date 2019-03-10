package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.List;
import java.util.Objects;

public class Tester extends Inferior {
    private String typeQA;


    public Tester() {
        }

    public Tester(int id) {
        super(id);
    }

    public Tester(String name, String surname, double salary, double bonus, int payRange, int experience,
                  Manager chief, List<String> skills, String typeQA) {
        super(name, surname, salary, bonus, payRange, experience, chief, skills);
        this.typeQA = typeQA;
    }

    public void setTypeQA(TypeQA typeQA) {
        this.typeQA = typeQA.typeQA;
    }

    public String getTypeQA() {
        return typeQA;
    }


    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Tester tester = (Tester) o;
        return Objects.equals(typeQA, tester.typeQA);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), typeQA);
    }

    @Override
    public String toString() {
        return super.toString() + "typeQA = " + typeQA;
    }


   public enum TypeQA {
        AUTOMATED("Automated testing"), MANUAL ("Manual Testing");
        String typeQA;

        TypeQA(String typeQA) {
            this.typeQA = typeQA;
        }
    }
}
