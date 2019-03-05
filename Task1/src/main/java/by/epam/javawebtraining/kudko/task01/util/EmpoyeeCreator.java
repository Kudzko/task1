package by.epam.javawebtraining.kudko.task01.util;


import by.epam.javawebtraining.kudko.task01.model.entity.*;


public class EmpoyeeCreator {
/* This is specialized simple factory.
Specific is in creating HRDepartment and adding there Employee anyway,
 that we can know about all employees for sure
 */

private static int id=0;

    public static Employee createEmployee(KindOfEmployee kindOfEmployee, boolean addToHRDepartment) /*throws UnknownEmployeeExceptoin */ {
        Employee employee; // That new employee is added to List<Employee> in HRDepartment
        //  if addToCompany == true .

        id++;
        switch (kindOfEmployee) {
            case tester:
                employee = new Tester(id);
                break;
            case developer:
                employee = new Developer(id);
                break;
            case teamLead:
                employee = new TeamLead(id);
                break;
            case projectManager:
                employee = new ProjectManager(id);
                break;
            default:
                employee = null;
                break;

            //throw new UnknownEmployeeExceptoin();
            /*
             * What is better here to return null or custom exception?
             * */
        }

        // I create here HRDepartment, witch is singleton
        // and add there employee if addToCompany == true
        if (addToHRDepartment) {
            HRDepartment hrDepartment = HRDepartment.createHRDepartment();
            hrDepartment.addEmployee(employee);
        }
        return employee;
    }
}
