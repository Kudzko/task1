package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class NoLettersInSurname extends LogicExceptoin {
    public NoLettersInSurname() {
    }

    public NoLettersInSurname(String message) {
        super(message);
    }
}
