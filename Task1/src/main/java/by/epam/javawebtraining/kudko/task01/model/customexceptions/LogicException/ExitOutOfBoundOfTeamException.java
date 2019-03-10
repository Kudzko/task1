package by.epam.javawebtraining.kudko.task01.model.customexceptions.LogicException;

public class ExitOutOfBoundOfTeamException extends Exception {
    public ExitOutOfBoundOfTeamException() {
    }

    public ExitOutOfBoundOfTeamException(String message) {
        super(message);
    }
}
