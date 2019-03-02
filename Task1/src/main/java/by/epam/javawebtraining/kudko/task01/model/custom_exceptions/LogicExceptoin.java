package by.epam.javawebtraining.kudko.task01.model.custom_exceptions;

public class LogicExceptoin extends KudkoTaskOneException {
    public LogicExceptoin() {
    }

    public LogicExceptoin(String message) {
        super(message);
    }

    public LogicExceptoin(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicExceptoin(Throwable cause) {
        super(cause);
    }

    public LogicExceptoin(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
