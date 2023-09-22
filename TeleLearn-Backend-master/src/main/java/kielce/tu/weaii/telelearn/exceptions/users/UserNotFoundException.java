package kielce.tu.weaii.telelearn.exceptions.users;

import kielce.tu.weaii.telelearn.exceptions.NotFoundException;
import kielce.tu.weaii.telelearn.models.UserRole;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(Long id) {
        super("user", id);
    }

    public UserNotFoundException(Long id, UserRole type) {
        super(type.getTypeDescription(), id);
    }

    public UserNotFoundException(String loginOrEmail) {
        super(String.format("The user with login or email %s was not found.", loginOrEmail));
    }
}
