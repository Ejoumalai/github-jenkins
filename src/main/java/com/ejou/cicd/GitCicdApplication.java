package com.ejou.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class GitCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitCicdApplication.class, args);
	}

	@GetMapping("/welcome")
	public  String welcome()
	{
		return "Welcome to CICD Git hub jenkins ";
	}

}
