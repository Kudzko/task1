package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidPayRangeValueException extends LogicExceptoin {

    public InvalidPayRangeValueException() {
    }

    public InvalidPayRangeValueException(String message) {
        super(message);
    }

}
