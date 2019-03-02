package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class InvalidSalaryValue extends LogicExceptoin {
    public InvalidSalaryValue() {
    }

    public InvalidSalaryValue(String message) {
        super(message);
    }
}
