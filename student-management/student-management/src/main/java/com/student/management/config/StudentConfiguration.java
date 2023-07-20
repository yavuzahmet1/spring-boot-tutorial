package com.student.management.config;

import com.student.management.model.Student;
import com.student.management.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ahmet = new Student(
                    "Ahmet",
                     LocalDate.of(
                    1900, APRIL,
                    1),
                    "ahmet@gmail.com");
            Student mehmet = new Student(
                    "Mehmet",
                     LocalDate.of(
                    1980, MARCH,
                    2),
                    "mehmet@gmail.com");

            repository.saveAll(
                    List.of(ahmet, mehmet)
            );
        };


    };
}
