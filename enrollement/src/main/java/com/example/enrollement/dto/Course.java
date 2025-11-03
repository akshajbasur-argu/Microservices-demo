package com.example.enrollement.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Course {
    private long id;
    private String name;
    private String courseCode;
    private int credit;
}
