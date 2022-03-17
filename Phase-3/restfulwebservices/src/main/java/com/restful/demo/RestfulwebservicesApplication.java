package com.restful.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.restful.control")
public class RestfulwebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulwebservicesApplication.class, args);
	}

}
