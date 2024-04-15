package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/jenkins")
public class JenkinsconfiappApplication {

	@GetMapping("/configApproach")
	public String getMessage()
	{
		return "Jenkins Configuration Approach";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsconfiappApplication.class, args);
	}

}
