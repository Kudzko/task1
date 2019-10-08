package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidEnteredDataException extends LogicExceptoin {
    public InvalidEnteredDataException() {
    }

    public InvalidEnteredDataException(String message) {
        super(message);
    }
}
