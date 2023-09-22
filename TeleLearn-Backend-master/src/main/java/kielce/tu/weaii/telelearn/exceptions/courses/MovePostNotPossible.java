package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class MovePostNotPossible extends BusinessLogicException {
    public MovePostNotPossible() {
        super("It is not possible to transfer posts to another course.");
    }
}
