package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class WrongProjectException extends LogicExceptoin {
    public WrongProjectException() {
    }

    public WrongProjectException(String message) {
        super(message);
    }
}
