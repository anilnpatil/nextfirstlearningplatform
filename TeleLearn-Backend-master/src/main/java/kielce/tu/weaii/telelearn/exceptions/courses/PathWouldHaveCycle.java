package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class PathWouldHaveCycle extends BusinessLogicException {
    public PathWouldHaveCycle() {
        super("After performing the operation, the path would have a cycle. Completing one of the preceding tasks would require completing the current one.");
    }
}
