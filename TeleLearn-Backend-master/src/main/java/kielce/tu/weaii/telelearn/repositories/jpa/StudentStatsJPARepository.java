package kielce.tu.weaii.telelearn.repositories.jpa;

import kielce.tu.weaii.telelearn.models.StudentStatsRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentStatsJPARepository extends JpaRepository<StudentStatsRecord, Long> {
    List<StudentStatsRecord> findAllByStudentId(Long studentId);

    Optional<StudentStatsRecord> findByScheduleId(Long scheduleId);
}
