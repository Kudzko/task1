package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

import by.epam.javawebtraining.kudko.task01.model.customexception.LogicExceptoin;

public class InvalidSalaryValue extends LogicExceptoin {
    public InvalidSalaryValue() {
    }

    public InvalidSalaryValue(String message) {
        super(message);
    }
}
