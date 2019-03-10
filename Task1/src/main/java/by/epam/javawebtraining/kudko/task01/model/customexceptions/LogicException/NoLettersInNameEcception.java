package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NoLettersInNameEcception extends LogicExceptoin {
    public NoLettersInNameEcception() {
    }

    public NoLettersInNameEcception(String message) {
        super(message);
    }
}
