package com.student.management.controller;

import com.student.management.model.Student;
import com.student.management.service.StudentService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.web.bind.annotation.*;

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
        return studentService.getStudents();
    }
   @PostMapping
   public void newStudent(@RequestBody Student newStudent){
        studentService.addNewStudent(newStudent);
   }

}
