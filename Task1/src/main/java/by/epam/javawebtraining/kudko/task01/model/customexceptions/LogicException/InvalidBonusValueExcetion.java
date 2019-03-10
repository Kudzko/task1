package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidBonusValueExcetion extends LogicExceptoin {

    public InvalidBonusValueExcetion() {
    }

    public InvalidBonusValueExcetion(String message) {
        super(message);
    }
}
