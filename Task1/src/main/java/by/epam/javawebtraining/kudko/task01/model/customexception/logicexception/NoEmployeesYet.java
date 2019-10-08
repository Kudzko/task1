package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NoEmployeesYet  extends LogicExceptoin {

    public NoEmployeesYet() {
    }

    public NoEmployeesYet(String message) {
        super(message);
    }
}
