package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NotFoundCurrentProjectException extends LogicExceptoin {

    public NotFoundCurrentProjectException() {
    }

    public NotFoundCurrentProjectException(String message) {
        super(message);
    }
}
