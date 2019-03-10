package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NoSuchProjectException extends LogicExceptoin {

    public NoSuchProjectException() {
    }

    public NoSuchProjectException(String message) {
        super(message);
    }
}
