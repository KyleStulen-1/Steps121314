package com.codewithheeren.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//adding create account/Signup page.
@SpringBootApplication
@ComponentScan("com.codewithheeren")
public class Step12Application {

	public static void main(String[] args) {
		SpringApplication.run(Step12Application.class, args);
	}
}
