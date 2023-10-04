package com.amigoscode.repository;

import com.amigoscode.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student>findStudentByEmail(String email);
}
