package com.example.course;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class Controller {

    private final CourseService service;

    @GetMapping("display")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(service.getAllCourses(), HttpStatus.OK);
    }
}
