package com.amigoscode.controller;

import com.amigoscode.model.Student;
import com.amigoscode.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/info")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping()
    public void registerNewStudent(@RequestBody Student student) throws IllegalAccessException {
        studentService.addNewStudent(student);
    }
}
