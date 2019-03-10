package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

import by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicExceptoin;

public class SetWrongLevelEnergy extends LogicExceptoin {
    public SetWrongLevelEnergy() {
    }

    public SetWrongLevelEnergy(String message) {
        super(message);
    }
}
