package com.example.enrollement.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Student {
    private long id;
    private String name;
    private int number;
}
