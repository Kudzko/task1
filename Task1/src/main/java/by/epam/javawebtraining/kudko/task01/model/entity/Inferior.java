package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * second level of abstraction
 */
public class Inferior extends Employee {
    private Manager chief;
    private List<String> skills;

    public Inferior() {
        skills = new ArrayList<>();
    }

    public Inferior(int id) {
        super(id);
        skills = new ArrayList<>();
    }

    public Inferior(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience, Manager chief, List<String> skills) {
        super(id, energy, name, surname, salary, bonus, payRange, experience);
        this.chief = chief;
        this.skills = skills;
    }

    public Inferior(Inferior other) {
        super(other);
        this.chief = other.chief;
        this.skills = other.skills;
    }

    @Override
    public void work() throws TooLowEnergyException, SetWrongLevelEnergy, NotFoundCurrentProjectException {
        if (getEnergy() >= 5) {
            setEnergy((int) (getEnergy() - 100 * 0.05));
        } else {
            throw new TooLowEnergyException("I am tired");
        }
    }

    @Override
    public void relax() throws TooHighEnergyException, SetWrongLevelEnergy {
        if (getEnergy() <= 95) {
            setEnergy((int) (getEnergy() + 100 * 0.05));
        } else {
            throw new TooHighEnergyException("I need work");
        }
    }

    public String execute() {
        return "Executing some orders";
    }

    public void addSkill(String skill) throws InvalidEnteredDataException {
        if ((skill != null) && (!skill.isEmpty())) {
            skills.add(skill);
        } else {
            throw new InvalidEnteredDataException("entered skill incorrect ( " +
                    "null or contains zero " +
                    "letters)");
        }
    }

    public Manager getChief() {
        return chief;
    }

    /**
     * If inferior has a chief field store reference to his chief
     * If inferior has no a chief field store null
     *
     * @param chief
     */
    public void setChief(Manager chief) {
        this.chief = chief;
    }

    public List<String> getSkills() {
        return skills;
    }

    public boolean setSkills(List<String> skills) {
        if ((skills != null) && (!skills.isEmpty())) {
            this.skills = skills;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
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
        StringBuilder inferior = new StringBuilder();
        inferior.append(super.toString());
        if (chief != null) {
            inferior.append("\n      chief = " + chief.getId() + ", " + chief.getName() + chief.getSurname());
        }
        if (skills != null) {
            inferior.append(",\n      skills = " + skills.toString());
        }
        inferior.append("]}");

        return inferior.toString();
    }

}
