package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class NoLettersInSurname extends LogicExceptoin {
    public NoLettersInSurname() {
    }

    public NoLettersInSurname(String message) {
        super(message);
    }
}
