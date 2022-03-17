package com.restfull.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.restfull.demo")
public class ResrfullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResrfullApiApplication.class, args);
	}

}
