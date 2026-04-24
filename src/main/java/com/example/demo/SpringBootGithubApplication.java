package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGithubApplication.class, args);
	}
	
	@GetMapping("/")
	public String sayHello(){
		return "Spring boot github integration";
	}

}
