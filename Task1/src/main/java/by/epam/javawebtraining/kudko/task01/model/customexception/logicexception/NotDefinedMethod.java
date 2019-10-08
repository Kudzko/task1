package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NotDefinedMethod  extends LogicExceptoin {
    public NotDefinedMethod() {
    }

    public NotDefinedMethod(String message) {
        super(message);
    }
}
