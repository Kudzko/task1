package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class IncorrectFrameValueException extends LogicExceptoin {
    public IncorrectFrameValueException() {
    }

    public IncorrectFrameValueException(String message) {
        super(message);
    }
}
