package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class SchedulePlannedTimeUpdateNotPossible extends BusinessLogicException {
    public SchedulePlannedTimeUpdateNotPossible() {
        super("You cannot update the planned execution time for past plans.");
    }
}
