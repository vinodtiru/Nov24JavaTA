package com.tekarch.customerms.Services;


import com.tekarch.customerms.Models.Student;
import com.tekarch.customerms.Repositories.StudentRepository;
import com.tekarch.customerms.Services.Interfaces.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private static final Logger logger = LogManager.getLogger(StudentServiceImpl.class);

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        System.out.println("New request to add student ");
        logger.info("New request to add student and i am logging it");
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
