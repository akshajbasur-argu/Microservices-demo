package com.example.enrollement.repository;

import com.example.enrollement.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {
    List<Enrollment> findByStudentId(long studentId);
    List<Enrollment> findByCourseId(long courseId);
}
