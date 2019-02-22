package by.epam.javawebtraining.kudko.task01.model.entity;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Objects;

public class ProjectManager extends Manager {

    List<Employee> projectTeam;

    {
        System.out.println("Hello from initialisation block of ProjectManager");
    }

    public ProjectManager() {
        projectTeam = new ArrayList<>();


        System.out.println("Hello from default constructor of ProjectManager");
    }

    public ProjectManager(String name, String surname, String positoin, double salary, double bonus, int payRange,
                          int experience, Inferior[] inferiors, Manager leader, List<Employee> projectTeam) {
        super(name, surname, positoin, salary, bonus, payRange, experience, inferiors, leader);
        this.projectTeam = projectTeam;

        System.out.println("Hello from custom constructor of ProjectManager");
    }

    public void runProject (){
        System.out.println("Manage project");
    }

    public List<Employee> getProjectTeam() {
        return projectTeam;
    }

    public void setProjectTeam(List<Employee> projectTeam) {
        this.projectTeam = projectTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectManager)) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(projectTeam, that.projectTeam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), projectTeam);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n projectTeam=" + projectTeam.toString() +
                " ]" +
                '}';
    }
}