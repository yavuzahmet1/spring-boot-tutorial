package com.student.management.service;

import com.student.management.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAll() {
        return List.of(
                new Student(1L,
                        "Ahmet",
                        21, LocalDate.of(
                        1900, Month.APRIL,
                        1),
                        "ahmet@gmail.com")
        );
    }
}
