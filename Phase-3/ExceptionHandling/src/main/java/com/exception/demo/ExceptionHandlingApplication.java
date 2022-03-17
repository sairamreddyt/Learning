package com.exception.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.exception.controller")
public class ExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingApplication.class, args);
	}

}
