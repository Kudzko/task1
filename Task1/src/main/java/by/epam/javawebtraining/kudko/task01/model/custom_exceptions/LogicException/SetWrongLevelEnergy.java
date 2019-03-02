package by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.custom_exceptions.LogicExceptoin;

public class SetWrongLevelEnergy extends LogicExceptoin {
    public SetWrongLevelEnergy() {
    }

    public SetWrongLevelEnergy(String message) {
        super(message);
    }
}
