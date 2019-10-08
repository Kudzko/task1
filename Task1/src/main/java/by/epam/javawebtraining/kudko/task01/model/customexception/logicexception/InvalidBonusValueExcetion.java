package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidBonusValueExcetion extends LogicExceptoin {

    public InvalidBonusValueExcetion() {
    }

    public InvalidBonusValueExcetion(String message) {
        super(message);
    }
}
