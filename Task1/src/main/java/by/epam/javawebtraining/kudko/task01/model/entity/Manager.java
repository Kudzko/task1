package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.SetWrongLevelEnergy;
import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.TooHighEnergyException;
import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.TooLowEnergyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Manager extends Employee {
    private List<Employee> employees;
    private Manager leader;

    {
        employees = new ArrayList<>();
    }

    /**
     * Default constructor
     */
    public Manager() {
    }

    /**
     * Constructor with id
     *
     * @param id
     */
    public Manager(int id) {
        super(id);
    }

    /**
     * Custom constructor
     *
     * @param id
     * @param energy
     * @param name
     * @param surname
     * @param salary
     * @param bonus
     * @param payRange
     * @param experience
     * @param employees
     * @param leader
     */
    public Manager(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience, List<Employee> employees, Manager leader) {
        super(id, energy, name, surname, salary, bonus, payRange, experience);
        this.employees = employees;
        this.leader = leader;
    }

    /**
     * constructor of copying
     *
     * @param other
     */
    public Manager(Manager other) {
        super(other);
        this.employees = other.employees;
        this.leader = other.leader;
    }

    @Override
    public void work() throws SetWrongLevelEnergy, TooLowEnergyException {
        if (getEnergy() >= 20) {

            setEnergy((int) (getEnergy() - 100 * 0.2));
        } else {
            throw new TooLowEnergyException("Very low energy. I need relax.");
        }
    }

    @Override
    public void relax() throws SetWrongLevelEnergy, TooHighEnergyException {
        if (getEnergy() <= 80) {

            setEnergy((int) (getEnergy() + 100 * 0.2));
        } else {
            throw new TooHighEnergyException("Very high energy. I need relax.");
        }
    }

    public String manage() {

        return "I am managing";
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        if ((employees != null) && (!employees.isEmpty())) {
            this.employees = employees;
        }
    }

    public void setEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    public Manager getLeader() {
        return leader;
    }

    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(employees, manager.employees) &&
                Objects.equals(leader, manager.leader);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), employees, leader);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     inferiors = " + inferiorsToString() +
                "\n     leader = " + leader +
                " ]" +
                "}\n";
    }

    public String inferiorsToString() {
        StringBuilder inferiorsToString = new StringBuilder();
        inferiorsToString.append("\n      ");
        for (Employee employee : employees) {
            if (employee != null) {
                inferiorsToString.append(employee.getId());
                inferiorsToString.append(", ");
                inferiorsToString.append(employee.getName());
                inferiorsToString.append(", ");
                inferiorsToString.append(employee.getSurname());
                inferiorsToString.append("; \n      ");
            }

        }

        return inferiorsToString.toString();
    }

}
