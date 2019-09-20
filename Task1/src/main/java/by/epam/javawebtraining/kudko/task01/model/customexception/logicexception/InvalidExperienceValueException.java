package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidExperienceValueException extends LogicExceptoin {


    public InvalidExperienceValueException() {
    }

    public InvalidExperienceValueException(String message) {
        super(message);
    }
}
