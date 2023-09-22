package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class ScheduleForPastNotPossible extends BusinessLogicException {
    public ScheduleForPastNotPossible() {
        super("Scheduling tasks into the past is not possible.");
    }
}
