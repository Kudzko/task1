package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidEnteredDataException extends LogicExceptoin {
    public InvalidEnteredDataException() {
    }

    public InvalidEnteredDataException(String message) {
        super(message);
    }
}
