package com.student.management.service;

import com.student.management.model.Student;
import com.student.management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student>getStudents(){
        return studentRepository.findAll();
    }

    public List<Student> getAll() {
        return List.of(
                new Student(1L,
                        "Ahmet",
                         LocalDate.of(
                        1900, Month.APRIL,
                        1),
                        "ahmet@gmail.com")
        );
    }

    public void addNewStudent(Student newStudent) {
        studentRepository.save(newStudent);
        System.out.println("newStudent");
    }
}
