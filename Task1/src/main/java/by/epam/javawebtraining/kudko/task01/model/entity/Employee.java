package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.*;

import java.util.Objects;


/**
 * Base class. Abstraction of employee of company
 */
public class Employee {

    private int id = -1;        // default value -1. It means that employee
    // don't belong to any team, company and is not in HRDepartment
    // and instance may use for finding
    private double energy = 100;   // range from 0 till 100
    private String name;
    private String surname;
    private double salary;         // in human*hours
    private double bonus;
    private int payRange;           // from 1 till 10
    private double experience;


    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience) {
        this.id = id;
        this.energy = energy;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
        this.payRange = payRange;
        this.experience = experience;
    }

    /**
     * Constructor of copying
     */
    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.surname = other.surname;
        this.salary = other.salary;
        this.bonus = other.bonus;
        this.payRange = other.payRange;
        this.experience = other.experience;
    }


    /**
     * By this method employee do some work
     * employee can do limited amount of work
     * without relax
     *
     * @throws TooLowEnergyException if employee do work
     *                               more then allowed without calling method relax()
     */
    public void work() throws TooLowEnergyException, SetWrongLevelEnergy, NotFoundCurrentProjectException {
        if (energy >= 10) {
            energy = getEnergy() - 100 * 0.1;
        } else {
            throw new TooLowEnergyException("I am tired");
        }

    }

    /**
     * By this method employee recover employee's energy
     * employee can do limited amount of rest
     * without work
     *
     * @throws TooHighEnergyException if employee relax
     *                                more then allowed without calling method work()
     */
    public void relax() throws TooHighEnergyException, SetWrongLevelEnergy {
        if (energy <= 90) {
            energy = getEnergy() + 100 * 0.1;
        } else {
            throw new TooHighEnergyException("I need work");
        }

    }


    //++++++++++++ GETTERS & SETTERS  ++++++++++++++++++++++

    /**
     * @return Name of employee
     */
    public String getName() {
        return name;
    }

    /**
     * Set name of employee
     * @param name
     * @throws NoLettersInNameEcception if name == null or lengs = 0
     */
    public void setName(String name) throws NoLettersInNameEcception {
        if ((name != null) && (name.length() > 0)) {
            this.name = name;
        } else {
            throw new NoLettersInNameEcception("You haven't entered any letters");
        }

    }

    /**
     * @return surname of employee
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set surname of employee
     * @param surname
     * @throws NoLettersInSurname if name == null or lengs = 0
     */
    public void setSurname(String surname) throws NoLettersInSurname {

        if ((surname != null) && (surname.length() > 0)) {
            this.surname = surname;
        } else {
            throw new NoLettersInSurname("No entered letters in surname");
        }

    }

    /**
     * @return double amount of salary of employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets double value of salary
     * @param salary
     * @throws InvalidSalaryValue if salary < 0
     */
    public void setSalary(double salary) throws InvalidSalaryValue {

        if (salary >= 0) {
            this.salary = salary;
        } else{
            throw new InvalidSalaryValue();
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) throws InvalidBonusValueExcetion {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else throw new InvalidBonusValueExcetion();
    }

    public int getPayRange() {
        return payRange;
    }

    public void setPayRange(int payRange) throws InvalidPayRangeValueException {
        if ((payRange >= 0) && (payRange <= 10)) {
            this.payRange = payRange;
        } else {
            throw new InvalidPayRangeValueException("You should set int value" +
                    " from 1 till 10");
        }

    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) throws InvalidExperienceValueException {
        if (experience >= 0) {
            this.experience = experience;
        } else {
            throw new InvalidExperienceValueException(" experience can't be " +
                    "less then 0");
        }
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) throws SetWrongLevelEnergy {
        if ((0 <= energy) && (energy <= 100)) {
            this.energy = energy;
        } else {
            throw new SetWrongLevelEnergy("Check " +
                    " value of energy. It must be from 0 till 100");
        }

    }

    /*right overriding equals:
    1. checking reference
    if (obj == this) {
и верните  return true;

    2. checking null & and class (better with getClass)
    3. Объявите переменную типа, который вы сравниваете,
     и приведите obj к этому типу. Потом сравнивайте каждый
      атрибут типа начиная с численных атрибутов (если имеются)
       потому что численные атрибуты проверяются быстрей.
        Сравнивайте атрибуты с помощью операторов И и ИЛИ
        (так называемые short-circuit logical operators) для
         объединения проверок с другими атрибутами.
    return id == guest.id
    // the same in equals in object
        && (firstName == guest.firstName
            || (firstName != null &&firstName.equals(guest.getFirstName())))        && (lastName == guest.lastName
            || (lastName != null && lastName .equals(guest.getLastName())
            ));
    }

*/
    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.energy, energy) == 0 &&
                Double.compare(employee.salary, salary) == 0 &&
                Double.compare(employee.bonus, bonus) == 0 &&
                payRange == employee.payRange &&
                Double.compare(employee.experience, experience) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, energy, name, surname, salary, bonus, payRange, experience);
    }

    @Override
    public String toString() {
        String[] className = this.getClass().getName().replace('.', ':').split(":");
        int indexNameOfClass = className.length - 1;

        return '{' + className[indexNameOfClass] +
                "[ id = " + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", payRange=" + payRange +
                ", experience=" + experience +
                " ]" +
                '}';
    }

}
