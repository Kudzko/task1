package by.epam.javawebtraining.kudko.task01.util.UtilException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class WrongNumberEmployeesException extends LogicExceptoin {
    public WrongNumberEmployeesException() {
    }

    public WrongNumberEmployeesException(String message) {
        super(message);
    }
}
