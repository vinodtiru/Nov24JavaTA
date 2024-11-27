package com.tekarch.customerms.Repositories;

import com.tekarch.customerms.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
