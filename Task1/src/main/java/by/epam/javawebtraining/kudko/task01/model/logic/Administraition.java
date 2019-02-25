package by.epam.javawebtraining.kudko.task01.model.logic;

import by.epam.javawebtraining.kudko.task01.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Administraition {

    public static void sortEmployeesBySalary(Team team) {

    }

    public static void sortEmployeesBySalary(Company company) {

    }

    public static double countTeamPrice(Team team) {
        double prise = 0.0;
        Employee[] employeeList = team.getWholeTeam();
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] != null) {
                prise += employeeList[i].getSalary();
            }
        }
        return prise;
    }


    /**
     * To find some employee by parameters, you should give to method instance of class witch has all
     * papamers you need. If there is some odd parameters - set "null" or "-1"  for int and double fields of
     * instances of needed class
     */
    public static List<Employee> findEmployeeByParameters(Employee findingEmployee, Company company) {
        List<Employee> foundEmploee = new ArrayList<>();

        for (Employee existEmployee : company.getEmployeesOfWholeCompany()) {
            if (checkFieldsByWholeParameters(findingEmployee, existEmployee)) {
                foundEmploee.add(existEmployee);
            }
        }
        return foundEmploee;
    }

    public static List<Employee> findEmployeeByParameters(Employee findingEmployee, Team team) {
        List<Employee> foundEmploee = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam()) {
            if (checkFieldsByWholeParameters(findingEmployee, existEmployee)) {
                foundEmploee.add(existEmployee);
            }
        }
        return foundEmploee;
    }

    private static boolean checkFieldsByWholeParameters(Employee findingEmployee, Employee existEmployee) {
        boolean found = true;
        found = checkEmployeeFields(findingEmployee, existEmployee);

        //Checking Manager fields then
        if (findingEmployee instanceof Manager) {
            if (existEmployee instanceof Manager){
                found = checkManagerFields((Manager) findingEmployee, (Manager) existEmployee);
            }else{
                found = false;
            }
        }

        //Checking Inferior fields then
        if (findingEmployee instanceof Inferior){
            if(existEmployee instanceof Inferior){
                found = checkInferiorFields((Inferior) findingEmployee, (Inferior) existEmployee);
            }else{
                found = false;
            }
        }

        //Checking ProjectManager fields then
        if (findingEmployee instanceof ProjectManager){
            if (existEmployee instanceof ProjectManager){
                found = checkProjectManagerFields((ProjectManager) findingEmployee, (ProjectManager) existEmployee);
            }else{
                found = false;
            }
        }

        //Checking TeamLead fields then
        if (findingEmployee instanceof TeamLead){
            if (existEmployee instanceof TeamLead){
                found = checkTeamLeadFields((TeamLead) findingEmployee, (TeamLead) existEmployee);
            }else {
                found = false;
            }
        }

        //Checking Developer fields then
        if (findingEmployee instanceof Developer) {
            found = checkDeveloperFields((Developer) findingEmployee, (Developer) existEmployee);
        }

        //Checking Tester fields then
        if (findingEmployee instanceof Tester) {
            found = checkTesterFields((Tester) findingEmployee, (Tester) existEmployee);
        }
        return found;
    }

    private static boolean checkEmployeeFields(Employee findingEmployee, Employee existEmployee) {
        //Checking Employee fields fist
        if (findingEmployee.getName() == null) {
            return false;
        }
        if (existEmployee.getName() != null) {
            if (!existEmployee.getName().equalsIgnoreCase(findingEmployee.getName())) {
                return false;
            }
        }

        if ((findingEmployee.getSurname() == null)
                || (!existEmployee.getSurname().equalsIgnoreCase(findingEmployee.getSurname()))) {
            return false;
        }
        if ((findingEmployee.getPositoin() == null)
                || (!existEmployee.getPositoin().equalsIgnoreCase(findingEmployee.getPositoin()))) {
            return false;
        }
        if ((findingEmployee.getSalary() == -1) || (existEmployee.getSalary() != findingEmployee.getSalary())) {
            return false;
        }
        if ((findingEmployee.getBonus() == -1) || (existEmployee.getBonus() != findingEmployee.getBonus())) {
            return false;
        }
        if ((findingEmployee.getPayRange() == -1) || (existEmployee.getPayRange() != findingEmployee.getPayRange())) {
            return false;
        }
        if ((findingEmployee.getExperience() == -1) || (existEmployee.getExperience() != findingEmployee.getExperience())) {
            return false;
        }
        return true;
    }

    private static boolean checkManagerFields(Manager findingEmployee, Manager existEmployee) {
        //cheking  field Inferior[] inferiors;
        if (findingEmployee.getInferiors() == null) {
            return false;
        }
        int i = 0;
        Inferior[] findingInferior, existInferior;
        findingInferior = findingEmployee.getInferiors();
        existInferior = existEmployee.getInferiors();
        while (i < findingInferior.length) {
            if (findingInferior[i] != null) {
                if (!findingInferior[i].equals(existInferior[i])) {
                    return false;
                }
            }
            i++;
        }
        // cheking  field  Manager leader;
        if ((findingEmployee.getLeader() == null) || (!findingEmployee.getLeader().equals(existEmployee.getLeader()))) {
            return false;
        }
        return true;
    }

    private static boolean checkInferiorFields(Inferior findingEmployee, Inferior existEmployee) {
        if ((findingEmployee.getChief() == null)
                || (!findingEmployee.getChief().equals(existEmployee.getChief()))) {
            return false;
        }
        int i = 0;
        List<String> findingSkils, existSkils;
        findingSkils = findingEmployee.getSkills();
        existSkils = existEmployee.getSkills();
        while (i < findingSkils.size()) {
            if (!findingSkils.get(i).equalsIgnoreCase(existSkils.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean checkProjectManagerFields(ProjectManager findingEmployee, ProjectManager existEmployee) {
        if (findingEmployee.getProjectTeam() == null) {
            return false;
        }
        int i = 0;
        List<Employee> findingProjectTeam, existProjectTeam;
        findingProjectTeam = findingEmployee.getProjectTeam();
        existProjectTeam = existEmployee.getProjectTeam();
        while (i < findingProjectTeam.size()) {
            if (!findingProjectTeam.get(i).equals(existProjectTeam.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean checkTeamLeadFields(TeamLead findingEmployee, TeamLead existEmployee) {
        if (findingEmployee.getTeam() == null) {
            return false;
        }
        int i = 0;
        List<Employee> findingSkils, existSkils;
        findingSkils = findingEmployee.getTeam();
        existSkils = existEmployee.getTeam();
        while (i < findingSkils.size()) {
            if (!findingSkils.get(i).equals(existSkils.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean checkDeveloperFields(Developer findingEmployee, Developer existEmployee) {
        System.out.println("Fields of Developer is not defined yet");
        return true;
    }

    private static boolean checkTesterFields(Tester findingEmployee, Tester existEmployee) {
        System.out.println("Fields of Tester is not defined yet");
        return true;
    }

    public static List<Employee> findExactEmployee(Employee employee, Team team) {
        List<Employee> rusult = new ArrayList<>();

        if ((employee != null) && (team != null)) {
            for (Employee empl : team.getWholeTeam()) {
                if ((empl != null) && (empl.equals(employee)))
                    rusult.add(empl);
            }
        }
        return rusult;
    }

    public static List<Employee> findExactEmployee(Employee employee, Company company) {
        List<Employee> rusult = new ArrayList<>();

        if ((employee != null) && (company != null)) {
            for (Employee empl : company.getEmployeesOfWholeCompany()) {
                if ((empl != null) && (empl.equals(employee)))
                    rusult.add(empl);
            }
        }
        return rusult;
    }

    public static List<ProjectManager> findProjectManager(ProjectManager findingProjectManager, Company company) {
        List<ProjectManager> foundProjectManager = new ArrayList<>();

        for (Employee existEmployee : company.getEmployeesOfWholeCompany())
            if (existEmployee instanceof ProjectManager) {
                if (checkEmployeeFields(findingProjectManager, existEmployee)
                        && checkManagerFields(findingProjectManager, (Manager) existEmployee)
                        && checkProjectManagerFields(findingProjectManager, (ProjectManager) existEmployee)) {
                    foundProjectManager.add((ProjectManager) existEmployee);
                }
            }
        return foundProjectManager;
    }

    public static List<ProjectManager> findProjectManager(ProjectManager findingProjectManager, Team team) {
        List<ProjectManager> foundProjectManager = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam())
            if (existEmployee instanceof ProjectManager) {
                if (checkEmployeeFields(findingProjectManager, existEmployee)
                        && checkManagerFields(findingProjectManager, (Manager) existEmployee)
                        && checkProjectManagerFields(findingProjectManager, (ProjectManager) existEmployee)) {
                    foundProjectManager.add((ProjectManager) existEmployee);
                }
            }
        return foundProjectManager;
    }

    public static List<TeamLead> findTeamLead(TeamLead findingTeamLead, Company company) {
        List<TeamLead> foundTeamLead = new ArrayList<>();

        for (Employee existEmployee : company.getEmployeesOfWholeCompany())
            if (existEmployee instanceof TeamLead) {
                if (checkEmployeeFields(findingTeamLead, existEmployee)
                        && checkManagerFields(findingTeamLead, (Manager) existEmployee)
                        && checkTeamLeadFields(findingTeamLead, (TeamLead) existEmployee)) {
                    foundTeamLead.add((TeamLead) existEmployee);
                }
            }
        return foundTeamLead;
    }

    public static List<TeamLead> findTeamLead(TeamLead findingTeamLead, Team team) {
        List<TeamLead> foundTeamLead = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam())
            if (existEmployee instanceof TeamLead) {
                if (checkEmployeeFields(findingTeamLead, existEmployee)
                        && checkManagerFields(findingTeamLead, (Manager) existEmployee)
                        && checkTeamLeadFields(findingTeamLead, (TeamLead) existEmployee)) {
                    foundTeamLead.add((TeamLead) existEmployee);
                }
            }
        return foundTeamLead;
    }

    public static List<Developer> findDeveloper(Developer findingDeveloper, Company company) {
        List<Developer> foundDeveloper = new ArrayList<>();

        for (Employee existEmployee : company.getEmployeesOfWholeCompany())
            if (existEmployee instanceof Developer) {
                if (checkEmployeeFields(findingDeveloper, existEmployee)
                        && checkInferiorFields(findingDeveloper, (Inferior) existEmployee)
                        && checkDeveloperFields(findingDeveloper, (Developer) existEmployee)) {
                    foundDeveloper.add((Developer) existEmployee);
                }
            }
        return foundDeveloper;
    }

    public static List<Developer> findDeveloper(Developer findingDeveloper, Team team) {
        List<Developer> foundDeveloper = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam())
            if (existEmployee instanceof Developer) {
                if (checkEmployeeFields(findingDeveloper, existEmployee)
                        && checkInferiorFields(findingDeveloper, (Inferior) existEmployee)
                        && checkDeveloperFields(findingDeveloper, (Developer) existEmployee)) {
                    foundDeveloper.add((Developer) existEmployee);
                }
            }
        return foundDeveloper;
    }

    public static List<Tester> findTester(Tester findingTester, Company company) {
        List<Tester> foundTester = new ArrayList<>();

        for (Employee existEmployee : company.getEmployeesOfWholeCompany())
            if (existEmployee instanceof Tester) {
                if (checkEmployeeFields(findingTester, existEmployee)
                        && checkInferiorFields(findingTester, (Inferior) existEmployee)
                        && checkTesterFields(findingTester, (Tester) existEmployee)) {
                    foundTester.add((Tester) existEmployee);
                }
            }
        return foundTester;
    }

    public static List<Tester> findDeveloper(Tester findingTester, Team team) {
        List<Tester> foundTester = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam())
            if (existEmployee instanceof Tester) {
                if (checkEmployeeFields(findingTester, existEmployee)
                        && checkInferiorFields(findingTester, (Inferior) existEmployee)
                        && checkTesterFields(findingTester, (Tester) existEmployee)) {
                    foundTester.add((Tester) existEmployee);
                }
            }
        return foundTester;
    }


}
