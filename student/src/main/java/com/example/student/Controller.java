package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class Controller {

    private final StudentService studentService;

    @GetMapping("")
    public ResponseEntity<String> greet(){
        System.out.println("inside controller");
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
    @GetMapping("/student/display")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
