package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Add any employee
     *
     * @param employee
     * @return true if employee added in the list of employees
     */
    public boolean addEmployee(Employee employee) {
        return allEmployees.add(employee);
    }

    /**
     * Add List of employees to HRDepartment
     *
     * @param employees
     * @return true if List<Employee> added to HRDepartment
     */
    public boolean addAllEmployees(List<Employee> employees) {
        return allEmployees.addAll(employees);
    }

    /**
     * Delete employee from {@link HRDepartment}
     * @param employee
     * @return true if {@link HRDepartment} contains such employee and
     * deletes this employee
     * @return false if {@link HRDepartment} has no matches (doesn't contain
     * such employee)
     */
    public boolean deleteEmployee(Employee employee) {
        return allEmployees.remove(employee);
    }

    /**
     *
     * @param index - index of the employee to be removed
     * @return the element previously at the specified position
     *
     * Throws:
     * UnsupportedOperationException - if the remove operation is not supported by this list
     * IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     */
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
