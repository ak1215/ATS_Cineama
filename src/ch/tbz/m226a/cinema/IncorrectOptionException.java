package ch.tbz.m226a.cinema;
import java.util.InputMismatchException;

/**
 * Selfmade Exception class
 */
public class IncorrectOptionException extends InputMismatchException {
    public IncorrectOptionException(String errorMessage) {
        super(errorMessage);
    }
}
