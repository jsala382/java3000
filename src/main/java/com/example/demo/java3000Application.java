package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class java3000Application {
	@GetMapping("/mensaje")

	public String mensaje(){
		return "WELCOME TO FROM JAVA AZURE";
	}
	public static void main(String[] args) {
		SpringApplication.run(java3000Application.class, args);
	}

}
