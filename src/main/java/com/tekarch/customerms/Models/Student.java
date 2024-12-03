package com.tekarch.customerms.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Student {
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
