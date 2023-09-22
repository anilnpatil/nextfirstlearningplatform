package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.NotFoundException;

public class StudentOnListNotFound extends NotFoundException {
    public StudentOnListNotFound(Long courseId, Long studentId) {
        super(String.format("Student with id %s was not found in the course list with id %s", studentId, courseId));
    }
}
