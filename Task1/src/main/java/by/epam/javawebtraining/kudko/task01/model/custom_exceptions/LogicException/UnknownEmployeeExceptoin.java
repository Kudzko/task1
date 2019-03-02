package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class UnknownEmployeeExceptoin  extends LogicExceptoin {
    public UnknownEmployeeExceptoin() {
    }

    public UnknownEmployeeExceptoin(String message) {
        super(message);
    }
}
