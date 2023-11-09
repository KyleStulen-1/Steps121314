package com.codewithheeren.springboot.service;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	private static Map<String,String> map = new HashMap<>();
	
	public void addCredentials(String username, String password) {
		map.put(username,password);
	}
	
	public boolean authenticate(String username, String password) {
		String existingPassword = map.get(username);
		if(existingPassword != null) {
		boolean isValidPassword = password.equals(existingPassword);		
			if(isValidPassword)
				return true;
		}
		return false;
	}
}