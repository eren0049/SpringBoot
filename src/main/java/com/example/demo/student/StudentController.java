package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired  // this auto wires the below studentservice with above studentservice.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    //Option #3
    @GetMapping()
    public List<Student> getStudents() {
        return studentService.getStudents();

    }
}