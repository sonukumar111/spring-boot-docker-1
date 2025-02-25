package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class SpringBootDocker1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDocker1Application.class, args);
	}
	
	@GetMapping("/test")
	public String testApplicationFromDocker() {
		
		return "Testing Docker response";
	}

}
