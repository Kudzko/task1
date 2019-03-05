package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HRDepartment {
    private static HRDepartment itHRDepartment;
    private List<Employee> allEmployees;

    private HRDepartment() {
        allEmployees = new ArrayList<Employee>();
    }

    public static HRDepartment createHRDepartment() {
        if (itHRDepartment == null) {
            itHRDepartment = new HRDepartment();
        }
        return itHRDepartment;
    }

    // +++methods of addition and deleting+++
    public boolean addEmployee(Employee employee) {
        return allEmployees.add(employee);
    }

    public boolean addAllEmployees(List<Employee> employees) {
        return allEmployees.addAll(employees);
    }

    public boolean deleteEmployee(Employee employee) {
        return allEmployees.remove(employee);
    }

    public Employee deleteEmployee(int index) {
        return allEmployees.remove(index);
    }

    public boolean deleteAllEmployees(List<Employee> employees) {
        return allEmployees.removeAll(employees);
    }
    //------


    // +++getters & setters +++
    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setEmployees(List<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }

    //-------


    @Override
    public String toString() {
        return "HRDepartment{" +
                "allEmployees = " + printAllEmployees() +
                '}';
    }

    private String printAllEmployees() {
        StringBuilder allEmployeesToPrint = new StringBuilder();
        for (Employee employeeToPrint :
                allEmployees) {
            allEmployeesToPrint.append(employeeToPrint);

        }
        return allEmployees.toString();
    }
}
