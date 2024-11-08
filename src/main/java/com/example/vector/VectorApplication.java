package com.example.vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class VectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(VectorApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "Raven", defaultValue = "World") String name){
		return String.format("Hello %s, This is a containerized spring application...!", name);
	}
}
