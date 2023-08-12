package com.kenkousen.tutorials.demowithkenkousen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.practice.*")
public class DemowithkenkousenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemowithkenkousenApplication.class, args);
	}

}
