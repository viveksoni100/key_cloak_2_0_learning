package com.example.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.example.studentapp.controller", "com.example.studentapp.service", "com.example.studentapp.security"})
@EntityScan({"com.example.studentapp.entity"})
@EnableJpaRepositories({"com.example.studentapp.repository"})
@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
