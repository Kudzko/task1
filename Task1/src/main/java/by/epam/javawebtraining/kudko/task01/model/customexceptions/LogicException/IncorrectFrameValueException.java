package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class IncorrectFrameValueException extends LogicExceptoin {
    public IncorrectFrameValueException() {
    }

    public IncorrectFrameValueException(String message) {
        super(message);
    }
}
