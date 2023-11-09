package com.codewithheeren.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//Profile page is populating user details.
//added User model class.
//added UserService to authenticate credentials and add new user.
@SpringBootApplication
@ComponentScan("com.codewithheeren")
public class Step14Application {

	public static void main(String[] args) {
		SpringApplication.run(Step14Application.class, args);
	}
}
