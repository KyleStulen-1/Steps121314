package com.codewithheeren.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//Enabling new account credentials for login.
@SpringBootApplication
@ComponentScan("com.codewithheeren")
public class Step13Application {

	public static void main(String[] args) {
		SpringApplication.run(Step13Application.class, args);
	}
}
