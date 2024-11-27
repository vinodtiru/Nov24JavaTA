package com.tekarch.customerms.Services.Interfaces;

import com.tekarch.customerms.Models.Customer;
import com.tekarch.customerms.Models.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
}
