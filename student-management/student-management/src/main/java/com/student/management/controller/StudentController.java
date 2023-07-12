package com.student.management.controller;

import com.student.management.model.Student;
import com.student.management.service.StudentService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getALl() {
        return studentService.getAll();
    }

}
