package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidPayRangeValueException extends LogicExceptoin {

    public InvalidPayRangeValueException() {
    }

    public InvalidPayRangeValueException(String message) {
        super(message);
    }

}
