package by.epam.javawebtraining.kudko.task01.util;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.*;
import by.epam.javawebtraining.kudko.task01.model.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
    public static String generateName() {
        String[] names = {"John", "Mike", "Bob", "Ben", "John", "Tim", "Brad",
                "Ariana", "John", "John"};
        Random random = new Random();
        return names[random.nextInt(names.length - 1)];
    }

    public static String generateSurname() {
        String[] names = {"Finder", "Sigal", "Rock", "Bush", "Grande", "Swift",
                "Newman", "Walker", "James", "Jonson"};
        Random random = new Random();
        return names[random.nextInt(names.length - 1)];
    }

    public static double generateSalary() {
        return Math.round(ThreadLocalRandom.current().nextDouble(10000.0, 30000.0));
    }

    public static int generatePayRange() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static double generateExperience(int boundOfExperience) {
        double[] ages = {1, 3, 5, 10, 6, 8, 2, 4, 5, 1};
        Random random = new Random();
        return ages[random.nextInt(ages.length - 1)];
    }

    public static Employee fillEmployeeFields(Employee employee) {
        try {
            employee.setName(generateName());
            employee.setSurname(generateSurname());
            employee.setSalary(generateSalary());
            employee.setPayRange(generatePayRange());
            employee.setExperience(generateExperience(10));
        } catch (NoLettersInNameEcception noLettersInNameEcception) {
            noLettersInNameEcception.printStackTrace();
        } catch (NoLettersInSurname noLettersInSurname) {
            noLettersInSurname.printStackTrace();
        } catch (InvalidSalaryValue invalidSalaryValue) {
            invalidSalaryValue.printStackTrace();
        } catch (InvalidPayRangeValueException e) {
            e.printStackTrace();
        } catch (InvalidExperienceValueException e) {
            e.printStackTrace();
        }

        return employee;
    }

    public static List<String> generateSkills() {
        List<String> skills = new ArrayList<>();
        String[] listSkills = {"Java", "CSS", " HTML", "JavaScript",
                "Jenkins", "Git"};
        Random random = new Random();
        skills.add(listSkills[random.nextInt(listSkills.length - 1)]);
        skills.add(listSkills[random.nextInt(listSkills.length - 1)]);
        return skills;
    }


}
