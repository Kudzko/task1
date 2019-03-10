package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class TooHighEnergyException extends LogicExceptoin {
    public TooHighEnergyException() {
    }

    public TooHighEnergyException(String message) {
        super(message);
    }
}
