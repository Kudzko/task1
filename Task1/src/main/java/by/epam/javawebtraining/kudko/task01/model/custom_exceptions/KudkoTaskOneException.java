package by.epam.javawebtraining.kudko.task01.model.custom_exceptions;

public class KudkoTaskOneException extends Exception {
    public KudkoTaskOneException() {
    }

    public KudkoTaskOneException(String message) {
        super(message);
    }

    public KudkoTaskOneException(String message, Throwable cause) {
        super(message, cause);
    }

    public KudkoTaskOneException(Throwable cause) {
        super(cause);
    }

    public KudkoTaskOneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
