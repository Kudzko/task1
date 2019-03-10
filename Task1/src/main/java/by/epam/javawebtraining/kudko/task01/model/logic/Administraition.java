package by.epam.javawebtraining.kudko.task01.model.logic;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.IncorrectFrameValueException;
import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.NoEmployeesYet;
import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.NotDefinedMethod;
import by.epam.javawebtraining.kudko.task01.model.entity.*;
import by.epam.javawebtraining.kudko.task01.model.logic.comparator.ComparatorCreator;
import by.epam.javawebtraining.kudko.task01.model.logic.comparator.SurnameComparator;
import by.epam.javawebtraining.kudko.task01.model.logic.comparator.TypeComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Administraition {

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

    //++++++++++++++++SORTING BLOCK++++++++++++++++++
    public static void sortEmployeesBySurname(HRDepartment hrDepartment) {
        Comparator<Employee> comparator = ComparatorCreator.createCompararor(TypeComparator.SurnameComparator);
        hrDepartment.getAllEmployees().sort(comparator);
    }

    public static void sortEmployeesBySurname(Team team) {
        Comparator<Employee> comparator = new SurnameComparator();
        Arrays.sort(team.getWholeTeam(), 0, team.getCounter() + 1, comparator);
    }

    public static void sortEmployeesByComparator(HRDepartment hrDepartment, TypeComparator typeComparator) {
        Comparator<Employee> comparator = ComparatorCreator.createCompararor(typeComparator);
        hrDepartment.getAllEmployees().sort(comparator);
    }

    public static void sortEmployeesByComparator(Team team, TypeComparator typeComparator) {
        Comparator<Employee> comparator = ComparatorCreator.createCompararor(typeComparator);
        Arrays.sort(team.getWholeTeam(), 0, team.getCounter() + 1, comparator);
    }

//----------------------------------------------------


//++++++++++++++FINDING BLOCK BY PARAMETERS+++++++++++++++++++++++++++++++++++++++

    /**
     * To find some employee by parameters, you should give to method instance of class witch has all
     * papamers you need. If there is some odd parameters - set "null"  or "-1"  (for int and double fields of
     * instances of needed class)
     * And choose find by strict match or soft match
     */
    public static List<Employee> findEmployeeByParametersStrictly(Employee findingEmployee, HRDepartment HRDepartment)
            throws NotDefinedMethod {
        return findEmployeeByParameters(findingEmployee, HRDepartment, true);
    }

    public static List<Employee> findEmployeeByParametersSoftly(Employee findingEmployee, HRDepartment HRDepartment)
            throws NotDefinedMethod {
        return findEmployeeByParameters(findingEmployee, HRDepartment, false);
    }

    public static List<Employee> findEmployeeByParameters(Employee findingEmployee, HRDepartment hrDepartment, boolean strictly)
           {
        List<Employee> foundEmploee = new ArrayList<>();

        for (Employee existEmployee : hrDepartment.getAllEmployees()) {
            if (checkFieldsByWholeParameters(findingEmployee, existEmployee, strictly)) {
                foundEmploee.add(existEmployee);
            }
        }
        return foundEmploee;
    }

    public static List<Employee> findEmployeeByParametersStrictly(Employee findingEmployee, Team team)
            throws NotDefinedMethod {
        return findEmployeeByParameters(findingEmployee, team, true);
    }

    public static List<Employee> findEmployeeByParametersSoftly(Employee findingEmployee, Team team)
            throws NotDefinedMethod {
        return findEmployeeByParameters(findingEmployee, team, false);
    }

    public static List<Employee> findEmployeeByParameters(Employee findingEmployee, Team team, boolean strictly)
           {
        List<Employee> foundEmploee = new ArrayList<>();

        for (Employee existEmployee : team.getWholeTeam()) {
            if ((existEmployee != null) && (checkFieldsByWholeParameters(findingEmployee, existEmployee, strictly))) {
                foundEmploee.add(existEmployee);
            }
        }
        return foundEmploee;
    }


    private static boolean checkFieldsByWholeParametersStrictly(Employee findingEmployee, Employee existEmployee)
           {
        return checkFieldsByWholeParameters(findingEmployee, existEmployee, true);
    }

    private static boolean checkFieldsByWholeParametersSoftly(Employee findingEmployee, Employee existEmployee)
           {
        return checkFieldsByWholeParameters(findingEmployee, existEmployee, false);
    }

    private static boolean checkFieldsByWholeParameters(Employee findingEmployee, Employee existEmployee, boolean strictly)
              {

        boolean found = false;
        boolean strictMathcing = true;

        //Checking Employee fields then
        if (checkEmployeeFields(findingEmployee, existEmployee, strictly)) {
            found = true;
        } else {
            strictMathcing = false;
        }

        //Checking Manager fields then
        if ((findingEmployee instanceof Manager) && (existEmployee instanceof Manager)) {
            if (checkManagerFields((Manager) findingEmployee, (Manager) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }
        }

        //Checking Inferior fields then
        if ((findingEmployee instanceof Inferior) && (existEmployee instanceof Inferior)) {
            if (checkInferiorFields((Inferior) findingEmployee, (Inferior) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }
        }

        //Checking ProjectManager fields then
        if ((findingEmployee instanceof ProjectManager) && (existEmployee instanceof ProjectManager)) {
            if (checkProjectManagerFields((ProjectManager) findingEmployee, (ProjectManager) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }
        }

        //Checking TeamLead fields then
        if ((findingEmployee instanceof TeamLead) && (existEmployee instanceof TeamLead)) {
            if (checkTeamLeadFields((TeamLead) findingEmployee, (TeamLead) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }
        }

        //Checking Developer fields then
        if ((findingEmployee instanceof Developer) && (existEmployee instanceof Developer)) {
            if (checkDeveloperFields((Developer) findingEmployee, (Developer) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }

        }


        //Checking Tester fields then
        if ((findingEmployee instanceof Tester) && (existEmployee instanceof Tester)) {
            if (checkTesterFields((Tester) findingEmployee, (Tester) existEmployee, strictly)) {
                found = true;
            } else {
                strictMathcing = false;
            }

        }

        if (strictly) {
            return strictMathcing;
        }
        return found;
    }


    private static boolean checkEmployeeFieldsStrictly(Employee findingEmployee, Employee existEmployee) {
        return checkEmployeeFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkEmployeeFieldsSoftly(Employee findingEmployee, Employee existEmployee) {
        return checkEmployeeFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkEmployeeFields(Employee findingEmployee, Employee existEmployee, boolean strictly) {

        //Checking Employee fields
        boolean mathcing = false;
        boolean strictMathcing = true;

        if (findingEmployee.getName() != null) {
            if (existEmployee.getName() != null) {
                if (existEmployee.getName().equalsIgnoreCase(findingEmployee.getName())) {
                    mathcing = true;
                } else {
                    strictMathcing = false;
                }
            }
        }

        if (findingEmployee.getSurname() != null) {
            if (existEmployee.getSurname() != null) {
                if (existEmployee.getSurname().equalsIgnoreCase(findingEmployee.getSurname())) {
                    mathcing = true;
                } else {
                    strictMathcing = false;
                }
            }
        }

        if (findingEmployee.getSalary() != -1) {
            if (existEmployee.getSalary() == findingEmployee.getSalary()) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }
        }

        if (findingEmployee.getBonus() != -1) {
            if (existEmployee.getBonus() == findingEmployee.getBonus()) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }
        }

        if (findingEmployee.getPayRange() != -1) {
            if (existEmployee.getPayRange() == findingEmployee.getPayRange()) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }
        }

        if (findingEmployee.getExperience() != -1) {
            if (existEmployee.getExperience() == findingEmployee.getExperience()) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }
        }

        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
    }

    private static boolean checkManagerFieldsStrictly(Manager findingEmployee, Manager existEmployee) {
        return checkManagerFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkManagerFieldsSoftly(Manager findingEmployee, Manager existEmployee) {
        return checkManagerFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkManagerFields(Manager findingEmployee, Manager existEmployee, boolean strictly) {
        boolean mathcing = false;
        boolean strictMathcing = true;

        //cheking  field Inferior[] inferiors;
        if (findingEmployee.getEmployees() != null) {
            int i = 0;
            List<Employee> findingInferior, existInferior;
            findingInferior = findingEmployee.getEmployees();
            existInferior = existEmployee.getEmployees();
            if (existInferior != null) {
                while (i < findingInferior.size()) {
                    if ((findingInferior.get(i) != null) && (existInferior.get(i) != null)) {
                        if (findingInferior.get(i).equals(existInferior.get(i))) {
                            mathcing = true;
                        } else {
                            strictMathcing = false;
                        }
                    }
                    i++;
                }
            }
        }

        // cheking  field  leader;
        if ((findingEmployee.getLeader() != null) && (existEmployee.getLeader() != null)) {
            if (findingEmployee.getLeader().equals(existEmployee.getLeader())) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }

        }
        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
    }

    private static boolean checkInferiorFieldsStrictly(Inferior findingEmployee, Inferior existEmployee) {
        return checkInferiorFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkInferiorFieldsSoftly(Inferior findingEmployee, Inferior existEmployee) {
        return checkInferiorFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkInferiorFields(Inferior findingEmployee, Inferior existEmployee, boolean strictly) {
        boolean mathcing = false;
        boolean strictMathcing = true;

        //checking field chief
        if ((findingEmployee.getChief() != null) && (existEmployee.getChief() != null)) {
            if (findingEmployee.getChief().equals(existEmployee.getChief())) {
                mathcing = true;
            } else {
                strictMathcing = false;
            }
        }

        //checking skills
        List<String> findingSkils, existSkils;
        findingSkils = findingEmployee.getSkills();
        existSkils = existEmployee.getSkills();
        if ((findingSkils != null) && (existSkils != null)) {
            int i = 0;
            while (i < findingSkils.size()) {
                if ((existSkils.get(i) != null) && (findingSkils.get(i) != null)) {
                    if (findingSkils.get(i).equalsIgnoreCase(existSkils.get(i))) {
                        mathcing = true;
                    } else {
                        strictMathcing = false;
                    }
                }
                i++;
            }
        }
        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
    }

    private static boolean checkProjectManagerFieldsStrictly(ProjectManager findingEmployee, ProjectManager existEmployee) {
        return checkProjectManagerFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkProjectManagerFieldsSoftly(ProjectManager findingEmployee, ProjectManager existEmployee) {
        return checkProjectManagerFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkProjectManagerFields(ProjectManager findingEmployee, ProjectManager existEmployee,
                                                     boolean strictly) {
        boolean mathcing = false;
        boolean strictMathcing = true;

        // checking field currentProjects
        if ((findingEmployee.getProjects() != null) && (existEmployee
                .getProjects() != null)) {

            List<Project> findingProjects, existProjects;
            findingProjects = findingEmployee.getProjects();
            existProjects = existEmployee.getProjects();

            boolean[] matchings = compareProjectManagerField(findingProjects, existProjects);
            mathcing = matchings[0];
            strictMathcing = matchings[1];


        }


        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
    }

    private static boolean[] compareProjectManagerField(List<Project>
                                                                findingProjects, List<Project> existProjects) {
        boolean[] mathcings = new boolean[2];
        int i = 0;
        while ((i < findingProjects.size()) & (i < existProjects.size())) {
            if ((findingProjects.get(i) != null) && (existProjects.get(i) != null)) {
                if (findingProjects.get(i).equals(existProjects.get(i))) {
                    mathcings[0] = true;
                } else {
                    mathcings[1] = false;
                }
            }
            i++;
        }
        return mathcings;
    }


    private static boolean checkTeamLeadFieldsStrictly(TeamLead findingEmployee, TeamLead existEmployee) {
        return checkTeamLeadFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkTeamLeadFieldsSoftly(TeamLead findingEmployee, TeamLead existEmployee) {
        return checkTeamLeadFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkTeamLeadFields(TeamLead findingEmployee, TeamLead existEmployee, boolean strictly) {
        boolean mathcing = false;
        boolean strictMathcing = true;

        // checking field controllingSomeTask
        if (findingEmployee.isControllingSomeTask() == existEmployee.isControllingSomeTask()) {
            mathcing = true;
        } else {
            strictMathcing = false;
        }

        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
    }


    private static boolean checkDeveloperFieldsStrictly(Developer findingEmployee, Developer existEmployee)   {
        return checkDeveloperFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkDeveloperFieldsSoftly(Developer findingEmployee, Developer existEmployee)   {
        return checkDeveloperFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkDeveloperFields(Developer findingEmployee,
                                                Developer existEmployee,
                                                boolean strictly)  {
        boolean mathcing = false;
        boolean strictMathcing = true;


        // checking field position
        if (findingEmployee.getPosition().equals(existEmployee.getPosition())) {
            mathcing = true;
        } else {
            strictMathcing = false;
        }

        if (strictly) {
            return strictMathcing;
        }
        return mathcing;
        //throw new NotDefinedMethod();

    }

    private static boolean checkTesterFieldsStrictly(Tester findingEmployee, Tester existEmployee)   {
        return checkTesterFields(findingEmployee, existEmployee, true);
    }

    private static boolean checkTesterFieldsSoftly(Tester findingEmployee, Tester existEmployee)   {
        return checkTesterFields(findingEmployee, existEmployee, false);
    }

    private static boolean checkTesterFields(Tester findingEmployee,
                                             Tester existEmployee,
                                             boolean strictly) {
        boolean mathcing = false;
        boolean strictMathcing = true;


        // checking field typeQA
        if (findingEmployee.getTypeQA().equals(existEmployee.getTypeQA())  ) {
            mathcing = true;
        } else {
            strictMathcing = false;
        }

        if (strictly) {
            return strictMathcing;
        }

        return mathcing;
        //throw new NotDefinedMethod();
    }


    // ++++++++ search by frameworks+++++++++++++++++

    /**
     * This method find employees by settes frames
     * if you don't need in some parameters - set them -1
     *
     * @param salaryFrom
     * @param bonusFrom
     * @param payRangeFrom
     * @param experienceFrom
     * @param salaryTill
     * @param bonusTill
     * @param payRangeTill
     * @param experienceTill
     * @return List<Employee> witch satisfy searching condition
     */
    public static List<Employee> searchByFrames(double salaryFrom, double bonusFrom, int payRangeFrom, double experienceFrom,
                                                double salaryTill, double bonusTill, int payRangeTill, double experienceTill)
            throws IncorrectFrameValueException {

        List<Employee> employeesInFrames = new ArrayList<>();
        HRDepartment hrDepartment = HRDepartment.createHRDepartment();

        for (Employee findingEmployee : hrDepartment.getAllEmployees()) {
            if (((((salaryFrom >= 0) || (salaryFrom == -1)) && (salaryFrom <= salaryTill)) || (salaryTill == -1))
                    && ((((bonusFrom >= 0) || (bonusFrom == -1)) && (bonusFrom <= bonusTill)) || (bonusTill == -1))
                    && ((((payRangeFrom >= 0) || (payRangeFrom == -1)) && (payRangeFrom <= payRangeTill)) || (payRangeTill == -1))
                    && ((((experienceFrom >= 0) || (experienceFrom == -1)) && (experienceFrom <= experienceTill)) || (experienceTill == -1))) {

                if (findingEmployee != null) {

                    if (((salaryFrom <= findingEmployee.getSalary()) || (salaryFrom == -1))
                            && ((salaryTill >= findingEmployee.getSalary()) || (salaryTill == -1))) {
                        if (((bonusFrom <= findingEmployee.getBonus()) || (bonusFrom == -1))
                                && ((bonusTill >= findingEmployee.getBonus()) || (bonusTill == -1))) {
                            if (((payRangeFrom <= findingEmployee.getPayRange()) || (payRangeFrom == -1))
                                    && ((payRangeTill >= findingEmployee.getPayRange()) || (payRangeTill == -1))) {
                                if (((experienceFrom <= findingEmployee.getExperience()) || (experienceFrom == -1))
                                        && ((experienceTill >= findingEmployee.getExperience()) || (experienceTill == -1))) {
                                    hrDepartment.addEmployee(findingEmployee);
                                }
                            }
                        }

                    }
                }
            } else {
                throw new IncorrectFrameValueException("Check if correct values of parameters : \n" +
                        "salaryFrom,  bonusFrom,  payRangeFrom,  experienceFrom,\n" +
                        "salaryTill,  bonusTill,  payRangeTill,  experienceTill" +
                        "\n may some of has  negative values, or values -Till less then values -From"
                );
            }


        }
        return employeesInFrames;
    }

//-----------------------------------------------------------------------------------


    //++++++++++++++++++ Max & Min values ++++++++++++++++++++++++++++++

    /**
     * Find employee in whole company with max salary
     *
     * @return Employee with max salary in company
     */
    public static Employee findMaxSalary() throws NoEmployeesYet {
        HRDepartment hrDepartment = HRDepartment.createHRDepartment();
        List<Employee> employees = hrDepartment.getAllEmployees();
        Employee employeeMaxSalary;

        // defend from NullPointerException
        employeeMaxSalary = findNonNullEmployee(employees);

        // finding emloyee with max salary
        for (Employee employee :
                employees) {
            if ((employee != null) && (employee.getSalary() > employeeMaxSalary.getSalary())) {
                employeeMaxSalary = employee;
            }

        }

        return employeeMaxSalary;

    }

    /**
     * Find employee in whole company with max salary
     *
     * @return Employee with max salary in company
     */
    public static Employee findMinSalary() throws NoEmployeesYet {
        HRDepartment hrDepartment = HRDepartment.createHRDepartment();
        List<Employee> employees = hrDepartment.getAllEmployees();
        Employee employeeMinSalary;

        // defend from NullPointerException
        employeeMinSalary = findNonNullEmployee(employees);

        // finding emloyee with max salary
        for (Employee employee :
                employees) {
            if ((employee != null) && (employee.getSalary() < employeeMinSalary.getSalary())) {
                employeeMinSalary = employee;
            }

        }

        return employeeMinSalary;

    }

    private static Employee findNonNullEmployee(List<Employee> employees) throws NoEmployeesYet {
        Employee notNullEmployee = null;
        if (employees.get(0) != null) {
            notNullEmployee = employees.get(0);
        } else {
            int i = 0;
            while ((i < employees.size()) && (employees.get(i) == null)) {
                notNullEmployee = employees.get(i);
                i++;
            }
        }
        if (notNullEmployee == null) {
            throw new NoEmployeesYet("HRDepartment haven't contain any employee yet");
        }
        return notNullEmployee;
    }
//--------------------------------------------------------------------------------

}
