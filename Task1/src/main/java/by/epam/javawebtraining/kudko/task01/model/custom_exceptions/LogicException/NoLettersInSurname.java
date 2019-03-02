package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class NoLettersInSurname extends LogicExceptoin {
    public NoLettersInSurname() {
    }

    public NoLettersInSurname(String message) {
        super(message);
    }
}
