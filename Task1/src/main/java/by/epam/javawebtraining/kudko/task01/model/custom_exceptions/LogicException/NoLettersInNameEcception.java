package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class NoLettersInNameEcception extends LogicExceptoin {
    public NoLettersInNameEcception() {
    }

    public NoLettersInNameEcception(String message) {
        super(message);
    }
}
