package com.example.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final Repo courseRepo;

    public CourseService(Repo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course getCourse(long id){
        return courseRepo.findById((int)id).orElseThrow();
    }
    public List<Course> getAllCourses(){
    return courseRepo.findAll();
    }
}
