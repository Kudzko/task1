package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class IncorrectFrameValueException extends LogicExceptoin {
    public IncorrectFrameValueException() {
    }

    public IncorrectFrameValueException(String message) {
        super(message);
    }
}
