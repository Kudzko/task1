package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException.WrongProjectException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProjectManager extends Manager {
   List<String> currentProjects;
    List<String> finishedProjects;



    {
        //  System.out.println("Hello from initialisation block of ProjectManager");
    }

    public ProjectManager() {
        currentProjects = new ArrayList<>();
        finishedProjects = new ArrayList<>();

        // System.out.println("Hello from default constructor of ProjectManager");
    }

    public ProjectManager(int id) {
         super(id);
        currentProjects = new ArrayList<>();
        finishedProjects = new ArrayList<>();

    }

    public ProjectManager(String name, String surname, double salary, double bonus, int payRange, int experience,
                          List<Employee> employees, Manager leader, List<String> currentProjects, List<String> finishedProjects) {
        super(name, surname, salary, bonus, payRange, experience, employees, leader);
        this.currentProjects = currentProjects;
        this.finishedProjects = finishedProjects;
    }

    public void runProject() {
        System.out.println("Manage project");
    }

    public void startProject ( String projectName) throws WrongProjectException{
        if ((projectName != null) && (projectName.length()>0)){
            currentProjects.add(projectName);
        }else {
            throw new WrongProjectException();
        }
         }
    public void finishProject ( String projectName) throws WrongProjectException{
        if ((projectName != null) && (projectName.length()>0)){
            if (currentProjects.contains(projectName)){
                int index = currentProjects.indexOf(projectName);
                finishedProjects.add( currentProjects.get(index));
                currentProjects.remove(index);
            }else {
                System.out.println("project not founded");
            }

        }else {
            throw new WrongProjectException();
        }
    }



    public List<String> getCurrentProjects() {
        return currentProjects;
    }

    public void setCurrentProjects(List<String> currentProjects) {
        this.currentProjects = currentProjects;
    }

    public List<String> getFinishedProjects() {
        return finishedProjects;
    }

    public void setFinishedProjects(List<String> finishedProjects) {
        this.finishedProjects = finishedProjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectManager)) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(currentProjects, that.currentProjects) &&
                Objects.equals(finishedProjects, that.finishedProjects);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), currentProjects, finishedProjects);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     projectTeam = " + printProjects() +
                " ]" +
                '}';
    }

    private String printProjects() {
        StringBuilder printingProjectTeam = new StringBuilder();
        printingProjectTeam.append("\n           Current projects: ");
        for (int i = 0; i < currentProjects.size(); i++) {
            printingProjectTeam.append(currentProjects.get(i));
            printingProjectTeam.append(", ");

        }
        printingProjectTeam.append("\n           Finished projects: ");
        for (int i = 0; i < finishedProjects.size(); i++) {
            printingProjectTeam.append(finishedProjects.get(i));
            printingProjectTeam.append(", ");

        }
        return printingProjectTeam.toString();
    }
}
