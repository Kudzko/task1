package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NotDefinedMethod  extends LogicExceptoin {
    public NotDefinedMethod() {
    }

    public NotDefinedMethod(String message) {
        super(message);
    }
}
