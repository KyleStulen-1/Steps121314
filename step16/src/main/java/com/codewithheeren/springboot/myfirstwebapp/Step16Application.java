package com.codewithheeren.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//Assignment - create profile page with good look and feel.
//add todo link in profile page.
@SpringBootApplication
@ComponentScan("com.codewithheeren")
public class Step16Application {

	public static void main(String[] args) {
		SpringApplication.run(Step16Application.class, args);
	}
}
