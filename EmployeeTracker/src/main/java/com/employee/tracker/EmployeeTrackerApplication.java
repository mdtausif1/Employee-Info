package com.employee.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EmployeeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTrackerApplication.class, args);
	}

}
