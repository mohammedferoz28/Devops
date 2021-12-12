package com.boot.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FerozWeek10GradedApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FerozWeek10GradedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Dev-Ops");
		
	}

}
