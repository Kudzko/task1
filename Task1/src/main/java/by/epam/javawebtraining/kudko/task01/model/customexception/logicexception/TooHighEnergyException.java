package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class TooHighEnergyException extends LogicExceptoin {
    public TooHighEnergyException() {
    }

    public TooHighEnergyException(String message) {
        super(message);
    }
}
