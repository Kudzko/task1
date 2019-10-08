package by.epam.javawebtraining.kudko.task01.model.entity;

import by.epam.javawebtraining.kudko.task01.model.customexception.logicexception.*;
import by.epam.javawebtraining.kudko.task01.util.DataGenerator;
import by.epam.javawebtraining.kudko.task01.util.ElementsCreator;
import by.epam.javawebtraining.kudko.task01.util.EmpoyeeCreator;
import org.junit.*;


public class DeveloperTest {
    static ProjectManager projectManager;
    static TeamLead teamLead;
    static Developer developer;
    static Team team;
    Developer developerClone;
    ProjectManager projectManagerClone;

    @BeforeClass
    public static void createTeam() {
        int amountTeams = 1;
        int[] amountEmloyeesEachTeam = {5};

        // creating teams and employees

        team = ElementsCreator.createTeam();

        projectManager = (ProjectManager) EmpoyeeCreator
                .createEmployeeWithID
                        (EmpoyeeCreator.EmployeeType.PROJECTMANAGER);
        projectManager = (ProjectManager) DataGenerator.fillEmployeeFields
                (projectManager);

        teamLead = (TeamLead) EmpoyeeCreator.createEmployeeWithID
                (EmpoyeeCreator.EmployeeType.TEAMLEAD);
        teamLead = (TeamLead) DataGenerator.fillEmployeeFields
                (teamLead);
        teamLead.setLeader(projectManager);

        team.addEmployee(projectManager);
        team.addEmployee(teamLead);
        developer = (Developer) EmpoyeeCreator
                .createEmployeeWithID
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

    @AfterClass
    public static void deleteTeam() {
        HRDepartment hrDepartment = HRDepartment.createHRDepartment();
        hrDepartment = null;
        projectManager = null;
        teamLead = null;
        developer = null;
        team = null;
        EmpoyeeCreator.resetID();
    }


    @Before
    public void cloneDeveloper() {
        developerClone = new Developer(developer);
        projectManagerClone = new ProjectManager(projectManager);

    }


    @Test
    public void tst_work() {
        projectManagerClone.startProject();
        double startLevelEnergy = developerClone.getEnergy();
        try {
            developerClone.work();
        } catch (SetWrongLevelEnergy setWrongLevelEnergy) {
            setWrongLevelEnergy.printStackTrace();
        } catch (TooLowEnergyException e) {
            e.printStackTrace();
        } catch (NotFoundCurrentProjectException e) {
            e.printStackTrace();
        }


        Assert.assertEquals(startLevelEnergy - 5, developerClone.getEnergy(),
                0.01);
        Assert.assertTrue(!projectManagerClone.getProjects().get(0).getCode()
                .isEmpty());

    }

    @Test
    public void tst_relax() {
        projectManagerClone.startProject();
        double startLevelEnergy = developerClone.getEnergy();
        try {
            developerClone.work();
            developerClone.relax();
        } catch (SetWrongLevelEnergy setWrongLevelEnergy) {
            setWrongLevelEnergy.printStackTrace();
        } catch (TooLowEnergyException e) {
            e.printStackTrace();
        } catch (NotFoundCurrentProjectException e) {
            e.printStackTrace();
        } catch (TooHighEnergyException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(startLevelEnergy, developerClone.getEnergy(),
                0.01);
    }

    @Test
    public void tst_addSkill() {

        String skill = "TestSkill";

        try {
            developerClone.addSkill(skill);
        } catch (InvalidEnteredDataException e) {
            e.printStackTrace();
        }

        Assert.assertTrue("Skill doesn't add", developerClone.getSkills().contains(skill));
    }

    @Test(expected = TooLowEnergyException.class)
    public void tst_workTooMuch() throws TooLowEnergyException {
        projectManagerClone.startProject();
        for (int i = 0; i < 21; i++) {
            try {
                developerClone.work();
            } catch (SetWrongLevelEnergy setWrongLevelEnergy) {
                setWrongLevelEnergy.printStackTrace();
            } catch (NotFoundCurrentProjectException e) {
                e.printStackTrace();
            }
        }

    }

    @Test(expected = TooHighEnergyException.class)
    public void tst_relaxTooMuch() throws TooHighEnergyException {
        projectManagerClone.startProject();

        try {
            developerClone.relax();
        } catch (SetWrongLevelEnergy setWrongLevelEnergy) {
            setWrongLevelEnergy.printStackTrace();
        }
    }

    @Test(expected = InvalidEnteredDataException.class)
    public void addSkillNull() throws InvalidEnteredDataException {
        developerClone.addSkill(null);
    }

    @Test(expected = InvalidEnteredDataException.class)
    public void addSkillEmptyString() throws InvalidEnteredDataException {
        developerClone.addSkill("");

    }


}
