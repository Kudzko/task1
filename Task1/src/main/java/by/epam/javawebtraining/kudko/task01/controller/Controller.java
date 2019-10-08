package by.epam.javawebtraining.kudko.task01.controller;

import by.epam.javawebtraining.kudko.task01.model.logic.Administraition;
import by.epam.javawebtraining.kudko.task01.model.entity.*;
import by.epam.javawebtraining.kudko.task01.util.DataGenerator;
import by.epam.javawebtraining.kudko.task01.util.ElementsCreator;
import by.epam.javawebtraining.kudko.task01.util.EmpoyeeCreator;
import by.epam.javawebtraining.kudko.task01.util.utilexception.WrongNumberEmployeesException;
import by.epam.javawebtraining.kudko.task01.view.ConsolePrinter;
import by.epam.javawebtraining.kudko.task01.view.InputView;
import by.epam.javawebtraining.kudko.task01.view.Printable;

public class Controller {
    public static void main(String[] args) {
        Company company = ElementsCreator.createCompany();
        InputView inputView = new InputView();

        int amountTeams = inputView.getAmauntTeams();
        int[] amountEmloyeesEachTeam = new int[amountTeams];

        try {
            amountEmloyeesEachTeam = inputView.getAmauntEmloyeesEachTeam();
        } catch (WrongNumberEmployeesException e) {
            e.printStackTrace();
        }

// creating teams and employees

        for (int i = 0; i < amountTeams; i++) {

            Team team = ElementsCreator.createTeam();
            ProjectManager projectManager;

            projectManager = (ProjectManager) EmpoyeeCreator
                    .createEmployeeWithID
                            (EmpoyeeCreator.EmployeeType.PROJECTMANAGER);
            projectManager = (ProjectManager) DataGenerator.fillEmployeeFields
                    (projectManager);

            TeamLead teamLead;
            teamLead = (TeamLead) EmpoyeeCreator.createEmployeeWithID
                    (EmpoyeeCreator.EmployeeType.TEAMLEAD);
            teamLead = (TeamLead) DataGenerator.fillEmployeeFields
                    (teamLead);
            teamLead.setLeader(projectManager);

            team.addEmployee(projectManager);
            team.addEmployee(teamLead);

            for (int k = 0; k < amountEmloyeesEachTeam[i] - 3; k++) {

                Developer developer;
                developer = (Developer) EmpoyeeCreator.createEmployeeWithID
                        (EmpoyeeCreator.EmployeeType.DEVELOPER);
                developer = (Developer) DataGenerator.fillEmployeeFields
                        (developer);
                developer.setSkills(DataGenerator.generateSkills());
                developer.setChief(teamLead);
                developer.setPosition(Developer.PositionType.MIDDLE);
                teamLead.setEmployee(developer);
                projectManager.setEmployee(developer);

                team.addEmployee(developer);
            }

            Tester tester;
            tester = (Tester) EmpoyeeCreator.createEmployeeWithID
                    (EmpoyeeCreator.EmployeeType.TESTER);
            tester = (Tester) DataGenerator.fillEmployeeFields
                    (tester);
            tester.setSkills(DataGenerator.generateSkills());
            tester.setChief(teamLead);
            tester.setTypeQA(Tester.TypeQA.AUTOMATED);
            teamLead.setEmployee(tester);
            projectManager.setEmployee(tester);

            team.addEmployee(tester);

            company.addTeamToComany(team);
        }


        HRDepartment hrDepartment = HRDepartment.createHRDepartment();


        // ACTIONS WITH EMPLOYEES


        // PRISES OF TEAMS
        double [] teamsPrises = new double[amountTeams];

        for (int i = 0; i < amountTeams; i++) {
            teamsPrises[i] = Administraition.countTeamPrice(company.getTeams()
                    .get(i));

        }


        Printable console = new ConsolePrinter();
        console.print("Priсes of teams : ", null);

        for (int i = 0; i < amountTeams; i++) {
            console.print("team  " + i + " : ", teamsPrises[i]);
                    }




        System.out.println("----------------COMPANY-----------------");
        for (int i = 0; i < hrDepartment.getAllEmployees().size();
             i++) {
            System.out.println(hrDepartment.getAllEmployees().get(i));
            System.out.println();
        }


//        Employee findingEmployee1 = projectManager1;
////        findingEmployee1.setName("John");
//
//        //finding by exact type of employee
////        System.out.println("Result of finding projectManager by name: " +
////                Administraition.findProjectManager((ProjectManager) findingEmployee1, HRDepartment)
////        );
////        System.out.println();
////        System.out.println();
//        //finding by fields of employee
////        System.out.println("Result of finding by name: ");
////        List<Employee> foundEmployee =  Administraition.findEmployeeByParametersStrictly(findingEmployee1, HRDepartment);
////
////        for (int i = 0; i < foundEmployee.size(); i++){
////            System.out.println(foundEmployee.get(i));
////            System.out.println();
////        }
//        developer1.energy;
//        Administraition.sortEmployeesByComparator(team1, TypeComparator.ClasstypeSurnameNameComparator);
//        System.out.println("Sorted TEAM: ");
//        for (int i = 0; i < team1.getWholeTeam().length; i++) {
//            System.out.println(team1.getWholeTeam()[i]);
//            System.out.println();
//        }


    }
}
