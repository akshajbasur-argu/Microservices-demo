package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final Repo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
