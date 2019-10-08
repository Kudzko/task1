package by.epam.javawebtraining.kudko.task01.util;


import by.epam.javawebtraining.kudko.task01.model.entity.*;


public class EmpoyeeCreator {
/* This is specialized simple factory.
Specific is in creating HRDepartment and adding there Employee anyway,
 that we can know about all employees for sure
 */

    private static int id = 0;

   public enum EmployeeType { // public that it can be used in Controller
       // fo example
        DEVELOPER, TESTER, TEAMLEAD, PROJECTMANAGER;
    }

    /**
     * Create instance of one kind of employee
     *
     * @param employeeType
     * @return instance according to enum EmployeeType
     */
    public static Employee createEmployee(EmployeeType employeeType)
    /*throws UnknownEmployeeExceptoin */ {

        Employee employee = null;

        switch (employeeType) {
            case TESTER:
                employee = new Tester();
                break;
            case DEVELOPER:
                employee = new Developer();
                break;
            case TEAMLEAD:
                employee = new TeamLead();
                break;
            case PROJECTMANAGER:
                employee = new ProjectManager();
                break;
        }

        return employee;
    }

    /**
     * Create instance of one kind of employee
     * Second variant of code, Trying make code more simple
     *
     * @param employeeType
     * @return instance according to enum EmployeeType
     */
    public static Employee createEmployeeTwo(EmployeeType employeeType)
    /*throws UnknownEmployeeExceptoin */ {
        switch (employeeType) {
            case TESTER:
                return new Tester();
            case DEVELOPER:
                return new Developer();
            case TEAMLEAD:
                return new TeamLead();
            case PROJECTMANAGER:
                return new ProjectManager();
        }
        return null;
    }

    /**
     * Create one of kinds of employee with id and add to HRDepartment
     * automatically
     *
     * @param employeeType
     * @return instance according to the value of enum EmployeeType of
     * parameter employeeType
     */
    public static Employee createEmployeeWithID(EmployeeType employeeType) {
        Employee employee = null;
        id++;

        switch (employeeType) {
            case TESTER:
                employee = new Tester(id);
                break;
            case DEVELOPER:
                employee = new Developer(id);
                break;
            case TEAMLEAD:
                employee = new TeamLead(id);
                break;
            case PROJECTMANAGER:
                employee = new ProjectManager(id);
                break;
        }

        addToHRDepartment(employee);

        return employee;
    }

    private static void addToHRDepartment(Employee employee) {
        HRDepartment hrDepartment = HRDepartment.createHRDepartment();
        hrDepartment.addEmployee(employee);
    }

    /**
     * Set id value = 0
     * Uses to run tests independently
     */
    public static void resetID() {
        id = 0;
    }
}
