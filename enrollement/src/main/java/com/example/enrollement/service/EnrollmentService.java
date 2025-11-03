package com.example.enrollement.service;

import com.example.enrollement.dto.Course;
import com.example.enrollement.dto.Student;
import com.example.enrollement.entity.Enrollment;
import com.example.enrollement.feignClient.CourseClient;
import com.example.enrollement.feignClient.StudentClient;
import com.example.enrollement.repository.EnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EnrollmentService {
    private final EnrollmentRepository repo;
    private final StudentClient studentClient;
    private final CourseClient courseClient;

    public EnrollmentService(EnrollmentRepository repo, StudentClient studentClient, CourseClient courseClient) {
        this.repo = repo;
        this.studentClient = studentClient;
        this.courseClient = courseClient;
    }

    public List<Student> getStudentByCourse(long courseId){
        List<Enrollment> enrollments = repo.findByCourseId(courseId);
        System.out.println("inside getStudentByCourse"+enrollments);
        List<Student> students= enrollments.stream()
                .map(enrollment -> studentClient.getStudentId(enrollment.getStudentId())).toList();
        System.out.println(students);
        return students;
    }

    public List<Course> getCourseByStudent(long studentId){
        List<Enrollment> enrollments = repo.findByStudentId(studentId);
        System.out.println(enrollments);
        List<Course> courses= enrollments.stream()
                .map(enrollment -> courseClient.getCourseId(enrollment.getCourseId())).toList();
        System.out.println(courses);
        return courses;
    }

    public Enrollment enrollStudent(long studentId, long courseId){
        Enrollment enrollment= Enrollment.builder().courseId(courseId)
                .studentId(studentId).enrollmentTime(LocalDateTime.now().toString()).build();
        return repo.save(enrollment);
    }

}
