package by.epam.javawebtraining.kudko.task01.view;

import by.epam.javawebtraining.kudko.task01.util.utilexception.WrongNumberEmployeesException;

public class InputView {
    int amountTeams = 3;
    int[] amountEmloyeesEachTeam = {5, 6, 7};


    public int getAmauntTeams() {
        return amountTeams;
    }

    public int[] getAmauntEmloyeesEachTeam() throws WrongNumberEmployeesException {
        for (int i = 0; i < amountEmloyeesEachTeam.length; i++) {
            if (amountEmloyeesEachTeam[i] < 3) {
                throw new WrongNumberEmployeesException("Wrong amount employees in team [" + i + "]");
            }
        }
        return amountEmloyeesEachTeam;
    }


}
