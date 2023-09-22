package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class StudentAlreadyEnrolled extends BusinessLogicException {
    public StudentAlreadyEnrolled() {
        super("You are already registered for kusu. If you don't have access, it means you're waiting for your teacher's approval.");
    }
}
