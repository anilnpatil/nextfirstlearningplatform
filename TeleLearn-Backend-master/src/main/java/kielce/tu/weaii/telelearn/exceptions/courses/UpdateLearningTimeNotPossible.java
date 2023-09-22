package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class UpdateLearningTimeNotPossible extends BusinessLogicException {
    public UpdateLearningTimeNotPossible() {
        super("Progress updates can only take place on the scheduled day.");
    }
}
