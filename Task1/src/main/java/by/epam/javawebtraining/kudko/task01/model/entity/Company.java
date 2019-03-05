package by.epam.javawebtraining.kudko.task01.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private List<Team> teams;
    private HRDepartment hrDepartment;

    public Company() {
        hrDepartment = HRDepartment.createHRDepartment();
        teams = new ArrayList<>();
    }

    public static Company createCompany() {
        return new Company();
    }


    // +++methods of addition and deleting+++
    public boolean addTeamToComany(Team team) {
        return teams.add(team);
    }

    public boolean addAllTaemsToComany(List<Team> teamsToAdd) {
        return teams.addAll(teamsToAdd);
    }

    public boolean deleteTeamFromComany(Team team) {
        return teams.remove(team);
    }

    public Team deleteTeamFromComany(int index) {
        return teams.remove(index);
    }

    public boolean deleteAllTeamsFromComany(List<Team> teamsToDelete) {
        return teams.removeAll(teamsToDelete);
    }
    //------


    // +++getters & setters +++

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public HRDepartment getHrDepartment() {
        return hrDepartment;
    }

    public void setHrDepartment(HRDepartment hrDepartment) {
        this.hrDepartment = hrDepartment;
    }

    //-------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(teams, company.teams) &&
                Objects.equals(hrDepartment, company.hrDepartment);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teams, hrDepartment);
    }

    @Override
    public String toString() {
        return "Company{" +
                "teams =" + teams +
                '}';
    }
}


