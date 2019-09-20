package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NoEmployeesYet  extends LogicExceptoin {

    public NoEmployeesYet() {
    }

    public NoEmployeesYet(String message) {
        super(message);
    }
}
