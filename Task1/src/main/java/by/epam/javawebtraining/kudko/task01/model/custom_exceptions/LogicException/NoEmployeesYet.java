package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class NoEmployeesYet  extends LogicExceptoin {

    public NoEmployeesYet() {
    }

    public NoEmployeesYet(String message) {
        super(message);
    }
}
