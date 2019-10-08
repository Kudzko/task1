package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidProjectNameException extends LogicExceptoin {
    public InvalidProjectNameException() {
    }

    public InvalidProjectNameException(String message) {
        super(message);
    }
}
