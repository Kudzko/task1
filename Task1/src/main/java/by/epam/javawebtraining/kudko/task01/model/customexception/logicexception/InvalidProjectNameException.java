package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidProjectNameException extends LogicExceptoin {
    public InvalidProjectNameException() {
    }

    public InvalidProjectNameException(String message) {
        super(message);
    }
}
