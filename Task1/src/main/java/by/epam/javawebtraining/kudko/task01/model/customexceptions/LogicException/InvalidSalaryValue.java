package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class InvalidSalaryValue extends LogicExceptoin {
    public InvalidSalaryValue() {
    }

    public InvalidSalaryValue(String message) {
        super(message);
    }
}
