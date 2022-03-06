package Lesson12_2_4.exceptions;

public class LimitSpeed80Exception extends RuntimeException {
    public LimitSpeed80Exception(String message) {
        super(message);
    }
}
