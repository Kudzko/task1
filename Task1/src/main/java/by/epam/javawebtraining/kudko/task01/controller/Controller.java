package by.epam.javawebtraining.kudko.task01.controller;

import by.epam.javawebtraining.kudko.task01.model.entity.*;
import by.epam.javawebtraining.kudko.task01.model.logic.Administraition;
import by.epam.javawebtraining.kudko.task01.util.EmpoyeeCreator;
import by.epam.javawebtraining.kudko.task01.util.KindOfEmployee;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        Employee projectManager1 = EmpoyeeCreator.createEmployee(KindOfEmployee.projectManager, true);
        Employee projectManager2 = EmpoyeeCreator.createEmployee(KindOfEmployee.projectManager, true);
        Employee teamLead1 = EmpoyeeCreator.createEmployee(KindOfEmployee.teamLead, true);
        Employee teamLead2 = EmpoyeeCreator.createEmployee(KindOfEmployee.teamLead, true);
        Employee developer1 = EmpoyeeCreator.createEmployee(KindOfEmployee.developer, true);
        Employee developer2 = EmpoyeeCreator.createEmployee(KindOfEmployee.developer, true);
        Employee developer3 = EmpoyeeCreator.createEmployee(KindOfEmployee.developer, true);
        Employee developer4 = EmpoyeeCreator.createEmployee(KindOfEmployee.developer, true);
        Employee developer5 = EmpoyeeCreator.createEmployee(KindOfEmployee.developer, true);
        Employee tester1 = EmpoyeeCreator.createEmployee(KindOfEmployee.tester, true);
        Employee tester2 = EmpoyeeCreator.createEmployee(KindOfEmployee.tester, true);

        Company company = Company.createCompany();

        Team team1 = new Team();
        Team team2 = new Team();

        team1.addEmployee(projectManager1);
        team1.addEmployee(teamLead1);
        team1.addEmployee(developer1);
        team1.addEmployee(developer2);
        team1.addEmployee(developer3);
        team1.addEmployee(tester1);

        team2.addEmployee(projectManager2);
        team2.addEmployee(teamLead2);
        team2.addEmployee(developer4);
        team2.addEmployee(developer5);
        team2.addEmployee(tester2);


        // Filling fields first developer
        developer1.setName("John");
        developer1.setSurname("Baker");
        developer1.setPositoin("middle");
        developer1.setSalary(10000);
        developer1.setBonus(500);
        developer1.setPayRange(2);
        developer1.setExperience(2);
        ((Developer) developer1).setChief((Manager) teamLead1);

        List<String> skills1 = new ArrayList<String>();
        skills1.add("Java");
        skills1.add("HTML");
        skills1.add("JS");

        ((Developer) developer1).setSkills(skills1);

        // Filling fields second developer
        developer2.setName("John");
        developer2.setSurname("Finder");
        developer2.setPositoin("senior");
        developer2.setSalary(15000);
        developer2.setBonus(600);
        developer2.setPayRange(5);
        developer2.setExperience(5);
        ((Developer) developer2).setChief((Manager) teamLead1);

        List<String> skills2 = new ArrayList<String>();
        skills2.add("Java");
        skills2.add("HTML");
        skills2.add("JS");
        skills2.add("Java EE");

        ((Developer) developer1).setSkills(skills2);

        // Filling fields third developer
        developer3.setName("Mike");
        developer3.setSurname("Sigal");
        developer3.setPositoin("senior");
        developer3.setSalary(12000);
        developer3.setBonus(400);
        developer3.setPayRange(5);
        developer3.setExperience(4);
        ((Developer) developer3).setChief((Manager) teamLead1);

        List<String> skills3 = new ArrayList<String>();
        skills3.add("Java SE");
        skills3.add("HTML");
        skills3.add("JS");
        skills3.add("Java EE");

        ((Developer) developer3).setSkills(skills3);

        // Filling fields fourth developer
        developer4.setName("Rick");
        developer4.setSurname("Rock");
        developer4.setPositoin("junior");
        developer4.setSalary(10000);
        developer4.setBonus(300);
        developer4.setPayRange(1);
        developer4.setExperience(1);
        ((Developer) developer4).setChief((Manager) teamLead2);

        List<String> skills4 = new ArrayList<String>();
        skills4.add("Java SE");
        skills4.add("HTML");
        skills4.add("JS");
        skills4.add("Java EE");

        ((Developer) developer4).setSkills(skills4);

        // Filling fields fifth developer
        developer5.setName("Dick");
        developer5.setSurname("Bush");
        developer5.setPositoin("senior");
        developer5.setSalary(20000);
        developer5.setBonus(700);
        developer5.setPayRange(6);
        developer5.setExperience(7);
        ((Developer) developer5).setChief((Manager) teamLead2);

        List<String> skills5 = new ArrayList<String>();
        skills5.add("Java SE");
        skills5.add("HTML");
        skills5.add("JS");
        skills5.add("Java EE");

        ((Developer) developer5).setSkills(skills5);


        // Filling fields first tester
        tester1.setName("Ariana");
        tester1.setSurname("Grande");
        tester1.setPositoin("senior");
        tester1.setSalary(20000);
        tester1.setBonus(700);
        tester1.setPayRange(6);
        tester1.setExperience(7);
        ((Tester) tester1).setChief((Manager) teamLead1);

        List<String> skills6 = new ArrayList<String>();
        skills6.add("Java SE");
        skills6.add("HTML");
        skills6.add("Jenkins");
        skills6.add("Selenium");

        ((Tester) tester1).setSkills(skills6);

        // Filling fields second tester
        tester2.setName("Tim");
        tester2.setSurname("Taylor");
        tester2.setPositoin("middle");
        tester2.setSalary(10000);
        tester2.setBonus(300);
        tester2.setPayRange(4);
        tester2.setExperience(2);
        ((Tester) tester2).setChief((Manager) teamLead2);

        List<String> skills7 = new ArrayList<String>();
        skills7.add("Java SE");
        skills7.add("Jenkins");
        skills7.add("Selenium");

        ((Tester) tester1).setSkills(skills7);

        // Filling fields first teamLead
        teamLead1.setName("John");
        teamLead1.setSurname("Newman");
        teamLead1.setPositoin("leader1");
        teamLead1.setSalary(20000);
        teamLead1.setBonus(700);
        teamLead1.setPayRange(7);
        teamLead1.setExperience(7);

        Inferior[] inferiorsTeamLead1 = {(Inferior) developer1, (Inferior) developer2, (Inferior) developer3,
                (Inferior) tester1};
        ((TeamLead) teamLead1).setInferiors(inferiorsTeamLead1);
        ((TeamLead) teamLead1).setLeader((Manager) projectManager1);

        // Filling fields second teamLead
        teamLead2.setName("John");
        teamLead2.setSurname("Walker");
        teamLead2.setPositoin("leader2");
        teamLead2.setSalary(20000);
        teamLead2.setBonus(700);
        teamLead2.setPayRange(7);
        teamLead2.setExperience(7);

        List<Employee> teamOfTeamLead2 = new ArrayList<Employee>();
        teamOfTeamLead2.add(developer4);
        teamOfTeamLead2.add(developer5);
        teamOfTeamLead2.add(tester2);
        ((TeamLead) teamLead2).setTeam(teamOfTeamLead2);
        ((TeamLead) teamLead2).setLeader((Manager) projectManager2);

        //filling fields first projectManager
        projectManager1.setName("John");
        projectManager1.setSurname("James");
        projectManager1.setPositoin("c.e.o.");
        projectManager1.setSalary(30000);
        projectManager1.setBonus(1000);
        projectManager1.setPayRange(10);
        projectManager1.setExperience(10);

        List<Employee> projectTeam1 = new ArrayList<Employee>();
        projectTeam1.add(teamLead1);
        projectTeam1.add(developer1);
        projectTeam1.add(developer2);
        projectTeam1.add(developer3);
        projectTeam1.add(tester1);
        ((ProjectManager) projectManager1).setProjectTeam(projectTeam1);

        //filling fields second projectManager
        projectManager2.setName("John");
        projectManager2.setSurname("Jonson");
        projectManager2.setPositoin("c.e.o.2");
        projectManager2.setSalary(30000);
        projectManager2.setBonus(1000);
        projectManager2.setPayRange(10);
        projectManager2.setExperience(10);

        List<Employee> projectTeam2 = new ArrayList<Employee>();
        projectTeam1.add(teamLead2);
        projectTeam1.add(developer4);
        projectTeam1.add(developer5);
        projectTeam1.add(tester2);
        ((ProjectManager) projectManager1).setProjectTeam(projectTeam2);

        // ACTIONS WITH EMPLOYEES



        // RISES OF TEAMS

        double teamPrice1 = Administraition.countTeamPrice(team1);
        double teamPrice2 = Administraition.countTeamPrice(team2);

        System.out.println("Priсe first team : " + teamPrice1);
        System.out.println("Priсe second team : " + teamPrice2);


//        System.out.println("---------------------------------");
//        for (int i = 0; i < company.getEmployeesOfWholeCompany().size(); i++){
//            System.out.println(company.getEmployeesOfWholeCompany().get(i));
//            System.out.println();
//        }



Employee [] teammm = team1.getWholeTeam();
        System.out.println("---------------------------------");
        for (int i = 0; i < teammm.length; i++){
            System.out.println(teammm[i]);
            System.out.println();
        }



//        Employee findingEmployee1 = new ProjectManager();
//        findingEmployee1.setName("John");
//
//        //finding by exact type of employee
//        System.out.println("Result of finding projectManager by name: " +
//                Administraition.findProjectManager((ProjectManager) findingEmployee1, team1)
//        );
//        System.out.println();
//        System.out.println();
//        //finding by fields of employee
//        System.out.println("Result of finding by name: ");
//        List<Employee> foundEmployee =  Administraition.findEmployeeByParameters( findingEmployee1, team1);
//
//        for (int i = 0; i < foundEmployee.size(); i++){
//            System.out.println(foundEmployee.get(i));
//            System.out.println();
//        }




    }
}
