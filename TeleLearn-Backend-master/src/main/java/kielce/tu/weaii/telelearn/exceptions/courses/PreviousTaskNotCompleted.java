package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class PreviousTaskNotCompleted extends BusinessLogicException {
    public PreviousTaskNotCompleted() {
        super("Before you can start or record learning a task, you must complete the previous tasks.");
    }
}
