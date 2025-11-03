package com.example.enrollement.feignClient;

import com.example.enrollement.dto.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STUDENT-SERVICE")
public interface StudentClient {
    @GetMapping("/student/{id}")
    Student getStudentId(@PathVariable Long id);
}
