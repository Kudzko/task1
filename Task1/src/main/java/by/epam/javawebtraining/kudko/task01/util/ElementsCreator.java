package by.epam.javawebtraining.kudko.task01.util;

import by.epam.javawebtraining.kudko.task01.model.entity.Company;
import by.epam.javawebtraining.kudko.task01.model.entity.Team;

public class ElementsCreator {
    public static Company createCompany(){
        return new Company();
    }

    public static Team createTeam(){
        return new Team();
    }

}
