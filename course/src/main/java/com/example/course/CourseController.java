package com.example.course;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable long id){
        return new ResponseEntity<>(service.getCourse(id),HttpStatus.OK);
    }
    @GetMapping("display")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(service.getAllCourses(), HttpStatus.OK);
    }
}
