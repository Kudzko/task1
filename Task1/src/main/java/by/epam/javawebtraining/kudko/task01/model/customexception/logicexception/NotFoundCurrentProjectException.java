package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NotFoundCurrentProjectException extends LogicExceptoin {

    public NotFoundCurrentProjectException() {
    }

    public NotFoundCurrentProjectException(String message) {
        super(message);
    }
}
