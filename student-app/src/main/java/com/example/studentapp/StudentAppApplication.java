package com.example.studentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ComponentScan({com...controller, com...service, com...security})
 * @EntityScan({com...entity})
 * @EnableJpaRepositories({com...repository})
 */
@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
