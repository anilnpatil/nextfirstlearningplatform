package kielce.tu.weaii.telelearn.exceptions.users;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class UsernameNotAvailableException extends BusinessLogicException {
    public UsernameNotAvailableException(String username) {
        super(String.format("Username %s is already in use", username));
    }
}
