package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NoLettersInNameEcception extends LogicExceptoin {
    public NoLettersInNameEcception() {
    }

    public NoLettersInNameEcception(String message) {
        super(message);
    }
}
