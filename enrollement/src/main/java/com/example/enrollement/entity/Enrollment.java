package com.example.enrollement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long studentId;
    private long courseId;
    private String enrollmentTime;

}
