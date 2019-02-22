package by.epam.javawebtraining.kudko.task01.model.logic;

import by.epam.javawebtraining.kudko.task01.model.entity.Company;
import by.epam.javawebtraining.kudko.task01.model.entity.Employee;
import by.epam.javawebtraining.kudko.task01.model.entity.Team;

import java.util.ArrayList;
import java.util.List;

public class Administraition {

    public static void sortEmployeesBySalary(Team team) {

    }

    public static void sortEmployeesBySalary(Company company) {

    }

    public static List<Employee> findEmployee(Employee employee, Team team) {
        List<Employee> rusult = new ArrayList<Employee>();

        if ((employee != null) && (team != null)) {
            for (Employee empl : team.getWholeTeam()) {
                if ((empl != null) && (empl.equals(employee)))
                    rusult.add(empl);
            }
        }
        return rusult;
    }

    public static List<Employee> findEmployee(Employee employee,Company company) {
        List<Employee> rusult = new ArrayList<Employee>();

        if ((employee != null) && (company != null)) {
            for (Employee empl : company.getEmployeesOfWholeCompany()) {
                if ((empl != null) && (empl.equals(employee)))
                    rusult.add(empl);
            }
        }
        return rusult;
    }


}
