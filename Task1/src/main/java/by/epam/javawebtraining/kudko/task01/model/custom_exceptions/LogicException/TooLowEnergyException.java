package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class TooLowEnergyException extends LogicExceptoin {
    public TooLowEnergyException() {
    }

    public TooLowEnergyException(String message) {
        super(message);
    }
}
