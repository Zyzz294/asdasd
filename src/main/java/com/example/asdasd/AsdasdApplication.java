package com.example.asdasd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AsdasdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsdasdApplication.class, args);
	}
@GetMapping("/")
	public String index() {
		return "<h2>Hello Hamza</h2>";
}
}