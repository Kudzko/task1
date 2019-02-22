package by.epam.javawebtraining.kudko.task01.util;


import by.epam.javawebtraining.kudko.task01.model.entity.*;


public class EmpoyeeCreator {
/* This is specialized simple factory.
Specific is in creating Company and adding there Employee anyway,
 that we can know about all employees for sure
 */

    public static Employee createEmployee(KindOfEmployee kindOfEmployee) /*throws UnknownEmployeeExceptoin */ {
        Employee employee; // That new employee is added to List<Employee> in Company I added this variable here
                        // and in switch and create here Company, witch is singleton
        Company company = Company.createCompany();

        switch (kindOfEmployee) {
            case tester:
                employee = new Tester();
                break;
            case developer:
                employee = new Developer();
                break;
            case teamLead:
                employee = new TeamLead();
                break;
            case projectManager:
                employee = new ProjectManager();
                break;
            default:
                employee = null;
                break;

            //throw new UnknownEmployeeExceptoin();
            /*
             * What is better here to return null or custom exception?
             * */
        }
        company.addEmployeeToComany(employee);
        return employee;
    }
}
