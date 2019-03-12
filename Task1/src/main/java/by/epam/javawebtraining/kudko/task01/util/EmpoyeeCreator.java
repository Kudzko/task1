package by.epam.javawebtraining.kudko.task01.util;


import by.epam.javawebtraining.kudko.task01.model.entity.*;


public class EmpoyeeCreator {
/* This is specialized simple factory.
Specific is in creating HRDepartment and adding there Employee anyway,
 that we can know about all employees for sure
 */

    private static int id = 0;

    /**
     * Create instance of one kind of employee
     *
     * @param kindOfEmployee
     * @return instance according to enum KindOfEmployee
     */
    public static Employee createEmployee(KindOfEmployee kindOfEmployee)
    /*throws UnknownEmployeeExceptoin */ {

        Employee employee = null;

        switch (kindOfEmployee) {
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
     * @param kindOfEmployee
     * @return instance according to enum KindOfEmployee
     */
    public static Employee createEmployeeTwo(KindOfEmployee kindOfEmployee)
    /*throws UnknownEmployeeExceptoin */ {
        switch (kindOfEmployee) {
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
     * @param kindOfEmployee
     * @return instance according to the value of enum KindOfEmployee of
     * parameter kindOfEmployee
     */
    public static Employee createEmployeeWithID(KindOfEmployee kindOfEmployee) {
        Employee employee = null;
        id++;

        switch (kindOfEmployee) {
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

        HRDepartment hrDepartment = HRDepartment.createHRDepartment();
        hrDepartment.addEmployee(employee);

        return employee;
    }


    public enum KindOfEmployee {
        DEVELOPER, TESTER, TEAMLEAD, PROJECTMANAGER;
    }

}
