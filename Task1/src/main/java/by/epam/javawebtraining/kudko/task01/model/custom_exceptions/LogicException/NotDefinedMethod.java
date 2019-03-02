package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class NotDefinedMethod  extends LogicExceptoin {
    public NotDefinedMethod() {
    }

    public NotDefinedMethod(String message) {
        super(message);
    }
}
