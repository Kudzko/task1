package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NoSuchProjectException extends LogicExceptoin {

    public NoSuchProjectException() {
    }

    public NoSuchProjectException(String message) {
        super(message);
    }
}
