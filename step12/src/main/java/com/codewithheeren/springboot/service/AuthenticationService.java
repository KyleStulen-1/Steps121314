package com.codewithheeren.springboot.service;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {	
		boolean isValidUserName = username.equalsIgnoreCase("heeren");
		boolean isValidPassword = password.equalsIgnoreCase("123");		
		return isValidUserName && isValidPassword;
	}
}