package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student james = new Student(
                    "James",
                    "james@email.com",
                    LocalDate.of(2012, 9, 25)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@email.com",
                    LocalDate.of(2006, 8, 15)
            );

            repository.saveAll(List.of(james, alex));
        };
    }
}
