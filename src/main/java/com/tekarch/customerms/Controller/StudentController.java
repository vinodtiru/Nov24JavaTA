package com.tekarch.customerms.Controller;

import com.tekarch.customerms.Models.Customer;
import com.tekarch.customerms.Models.Student;
import com.tekarch.customerms.Services.CustomerServiceImpl;
import com.tekarch.customerms.Services.StudentServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentServiceImpl studentServiceImpl;
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudent(){
            return new ResponseEntity<>(studentServiceImpl.getAllStudents(),HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        //try {
            return new ResponseEntity<>(studentServiceImpl.addStudent(student), HttpStatus.CREATED);
//        } catch (Exception e) {
//            return respondWithError(e);
//        }
    }

    @ExceptionHandler
    public ResponseEntity<String> respondWithError(Exception e){
        logger.error("Exception Occurred. Details : {}", e.getMessage());
        return new ResponseEntity<>("Exception Occurred. More Info :"
                + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
