package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class TooHighEnergyException extends LogicExceptoin {
    public TooHighEnergyException() {
    }

    public TooHighEnergyException(String message) {
        super(message);
    }
}
