package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class TooLowEnergyException extends LogicExceptoin {
    public TooLowEnergyException() {
    }

    public TooLowEnergyException(String message) {
        super(message);
    }
}
