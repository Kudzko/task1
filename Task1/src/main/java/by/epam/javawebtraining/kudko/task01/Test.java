package by.epam.javawebtraining.kudko.task01;


import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.NoLettersInNameEcception;
import by.epam.javawebtraining.kudko.task01.model.entity.Developer;
import by.epam.javawebtraining.kudko.task01.util.EmpoyeeCreator;

public class Test {


    public static void main(String[] args) {

        Developer developer1 = (Developer) EmpoyeeCreator.createEmployeeWithID
                (EmpoyeeCreator.EmployeeType.DEVELOPER);
        try {
            developer1.setName("John");
        } catch (NoLettersInNameEcception noLettersInNameEcception) {
            noLettersInNameEcception.printStackTrace();
        }
        Developer developer2 = new Developer(developer1);
        try {
            developer2.setName("Alex");
        } catch (NoLettersInNameEcception noLettersInNameEcception) {
            noLettersInNameEcception.printStackTrace();
        }

        System.out.println(developer1);
        System.out.println(developer2);
        System.out.println(developer1);
    }
}


