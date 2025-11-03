package com.example.enrollement.controller;

import com.example.enrollement.dto.Course;
import com.example.enrollement.dto.Student;
import com.example.enrollement.entity.Enrollment;
import com.example.enrollement.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("enrollment")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    EnrollmentController(EnrollmentService enrollmentService){
        this.enrollmentService=enrollmentService;
    }

    @GetMapping("student/{courseId}")
    public List<Student> getStudentByCourse(@PathVariable long courseId){
        return enrollmentService.getStudentByCourse(courseId);
    }

    @GetMapping("course/{studentId}")
    public List<Course> getCourseByStudent(@PathVariable long studentId){
        return enrollmentService.getCourseByStudent(studentId);
    }

    @GetMapping("add/{studentId}/{courseId}")
    public Enrollment saveEnrollment(@PathVariable long studentId, @PathVariable long courseId){
        return enrollmentService.enrollStudent(studentId,courseId);
    }
}
