package com.citi.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.citi")
public class MortgagePropertyFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MortgagePropertyFinderApplication.class, args);
	}
}
