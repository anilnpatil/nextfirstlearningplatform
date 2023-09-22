package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class TaskMustBeCompleted extends BusinessLogicException {
    public TaskMustBeCompleted() {
        super("To mark a task for repeat, the task must be completed.");
    }
}
