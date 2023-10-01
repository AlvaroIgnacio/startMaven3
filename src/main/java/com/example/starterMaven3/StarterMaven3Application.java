package com.example.starterMaven3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StarterMaven3Application {

	public static void main(String[] args) {
		SpringApplication.run(StarterMaven3Application.class, args);
	}

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	
}
