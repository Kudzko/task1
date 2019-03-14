package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException.InvalidEnteredDataException;
import by.epam.javawebtraining.kudko.task01.util.DataGenerator;
import by.epam.javawebtraining.kudko.task01.util.EmpoyeeCreator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class DeveloperParametrized {

    static Developer developer;

    Developer developerClone;
    ProjectManager projectManagerClone;
    private String skill;

    public DeveloperParametrized(String skill) {
        this.skill = skill;
    }

    @Parameterized.Parameters
    public static Collection set_parameters() {
        return Arrays.asList(new Object[]{
                null, ""
        });
    }

    @BeforeClass
    public static void createTeam() {
        developer = (Developer) EmpoyeeCreator
                .createEmployeeWithID
                        (EmpoyeeCreator.KindOfEmployee.DEVELOPER);
        developer = (Developer) DataGenerator.fillEmployeeFields
                (developer);
        developer.setSkills(DataGenerator.generateSkills());
        developer.setPosition(Developer.TypePosition.MIDDLE);
    }

    @Before
    public void cloneDeveloper() {
        developerClone = new Developer(developer);
    }

    @Test(expected = InvalidEnteredDataException.class)
    public void testInvalidSills() throws InvalidEnteredDataException {
        developerClone.addSkill(skill);
    }
}
