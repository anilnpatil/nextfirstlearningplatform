package kielce.tu.weaii.telelearn.exceptions;

public class InvalidSenderException extends BusinessLogicException {
    public InvalidSenderException() {
        super("Attempting to send a message for another user");
    }
}
