package com.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String name="mike";
		int x=100;
		SpringApplication.run(DemoApplication.class, args);
	}

}
