package com.tekarch.customerms.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Student {


    public Student() {
    }

    public Student(Long id, String name, String address, Integer age, double avgScore, String rollNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.avgScore = avgScore;
        this.rollNumber = rollNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private Integer age;
    private double avgScore;

    @Column(unique=true)
    private String rollNumber;
}
