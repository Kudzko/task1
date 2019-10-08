package by.epam.javawebtraining.kudko.task01.model.customexception.logicexception;

public class ExitOutOfBoundOfTeamException extends Exception {
    public ExitOutOfBoundOfTeamException() {
    }

    public ExitOutOfBoundOfTeamException(String message) {
        super(message);
    }
}
