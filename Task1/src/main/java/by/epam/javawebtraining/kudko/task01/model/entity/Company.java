package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private static Company itCompany;
    private List<Employee> employeesOfWholeCompany;
    private List<Team> teamsOfCompany;

    private Company() {
        employeesOfWholeCompany = new ArrayList<Employee>();
    }

    public static Company createCompany() {
        if (itCompany == null) {
            itCompany = new Company();
        }
        return itCompany;
    }
// +++methods of addition and deleting+++
    public boolean addEmployeeToComany(Employee employee) {
        return employeesOfWholeCompany.add(employee);
    }

    public boolean addAllEmployeesToComany(List<Employee> employees) {
        return employeesOfWholeCompany.addAll(employees);
    }

    public boolean deleteEmployeeFromComany(Employee employee) {
       return employeesOfWholeCompany.remove(employee);
    }

    public Employee deleteEmployeeFromComany(int index ) {
        return employeesOfWholeCompany.remove(index);
    }

    public boolean deleteAllEmployeeFromComany(List<Employee> employees ) {
       return employeesOfWholeCompany.removeAll(employees);
    }
 //------



// +++getters & setters +++
    public List<Employee> getEmployeesOfWholeCompany() {
        return employeesOfWholeCompany;
    }

    public void setEmployeesOfWholeCompany(List<Employee> employeesOfWholeCompany) {
        this.employeesOfWholeCompany = employeesOfWholeCompany;
    }

    public List<Team> getTeamsOfCompany() {
        return teamsOfCompany;
    }

    public void setTeamsOfCompany(List<Team> teamsOfCompany) {
        this.teamsOfCompany = teamsOfCompany;
    }

    //-------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(employeesOfWholeCompany, company.employeesOfWholeCompany) &&
                Objects.equals(teamsOfCompany, company.teamsOfCompany);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employeesOfWholeCompany, teamsOfCompany);
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeesOfWholeCompany=" + employeesOfWholeCompany +
                ", teamsOfCompany=" + teamsOfCompany +
                '}';
    }
}
