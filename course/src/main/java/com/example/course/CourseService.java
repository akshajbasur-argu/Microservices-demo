package com.example.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final Repo courseRepo;

    public List<Course> getAllCourses(){
    return courseRepo.findAll();
    }
}
