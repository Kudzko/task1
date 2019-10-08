package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.InvalidProjectNameException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Third level of abstraction
 */
public class ProjectManager extends Manager {
    private List<Project> projects;

    public ProjectManager() {
        projects = new ArrayList<>();
    }

    public ProjectManager(int id) {
        super(id);
        projects = new ArrayList<>();
    }

    public ProjectManager(int id, double energy, String name, String surname, double salary, double bonus, int payRange, double experience, List<Employee> employees, Manager leader, List<Project> projects) {
        super(id, energy, name, surname, salary, bonus, payRange, experience, employees, leader);
        this.projects = projects;
    }

    public ProjectManager(ProjectManager other) {
        super(other);
        this.projects = other.projects;
    }

    public void startProject() {
        projects.add(new Project());
    }

    public void finishProject(String projectName) throws InvalidProjectNameException {
        if ((projectName != null) && (projectName.length() > 0)) {

            boolean flag = true;
            int i = 0;

            while (flag) {
                if (projects.get(i).getName().equalsIgnoreCase(projectName)) {
                    projects.get(i).setStatus(false);
                    flag = false;
                }
                i++;
            }

        } else {
            throw new InvalidProjectNameException();
        }
    }


    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        if ((projects != null) && (!projects.isEmpty())) {
            this.projects = projects;
        }
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        if (this == o) return true;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), projects);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n     projects = " + projectsToString() +
                " ]" +
                '}';
    }

    private String projectsToString (){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < projects.size(); i++){
            stringBuilder.append(projects.get(i).getName());
            stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }


}
