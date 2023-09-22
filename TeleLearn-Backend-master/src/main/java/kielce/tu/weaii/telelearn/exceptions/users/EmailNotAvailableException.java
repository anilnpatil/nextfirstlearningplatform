package kielce.tu.weaii.telelearn.exceptions.users;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class EmailNotAvailableException extends BusinessLogicException {
    public EmailNotAvailableException(String email) {
        super(String.format("Address email %s is already in use", email));
    }
}
