package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidExperienceValueException extends LogicExceptoin {


    public InvalidExperienceValueException() {
    }

    public InvalidExperienceValueException(String message) {
        super(message);
    }
}
