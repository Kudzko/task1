package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class TooLowEnergyException extends LogicExceptoin {
    public TooLowEnergyException() {
    }

    public TooLowEnergyException(String message) {
        super(message);
    }
}
