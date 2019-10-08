package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class UnknownEmployeeExceptoin  extends LogicExceptoin {
    public UnknownEmployeeExceptoin() {
    }

    public UnknownEmployeeExceptoin(String message) {
        super(message);
    }
}
