package by.epam.javawebtraining.kudko.task01.util.utilexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class WrongNumberEmployeesException extends LogicExceptoin {
    public WrongNumberEmployeesException() {
    }

    public WrongNumberEmployeesException(String message) {
        super(message);
    }
}
