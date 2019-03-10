package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class UnknownEmployeeExceptoin  extends LogicExceptoin {
    public UnknownEmployeeExceptoin() {
    }

    public UnknownEmployeeExceptoin(String message) {
        super(message);
    }
}
