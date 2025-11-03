package com.example.enrollement.feignClient;

import com.example.enrollement.dto.Course;
import com.example.enrollement.dto.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "COURSE-SERVICE")
public interface CourseClient {
    @GetMapping("/course/{id}")
    Course getCourseId(@PathVariable Long id);
}