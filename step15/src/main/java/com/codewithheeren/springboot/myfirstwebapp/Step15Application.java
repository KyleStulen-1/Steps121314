package com.codewithheeren.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//populating error message on login page for wrong credentials.
//server side validations added on User class.
//Added bootstrap, jscript and jquery to view page.
@SpringBootApplication
@ComponentScan("com.codewithheeren")
public class Step15Application {

	public static void main(String[] args) {
		SpringApplication.run(Step15Application.class, args);
	}
}
