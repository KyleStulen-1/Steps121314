package com.codewithheeren.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.codewithheeren.springboot.entity.User;
import com.codewithheeren.springboot.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value="login",method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		
		if(userService.authenticate(username, password)) {
			model.put("user",userService.getUser(username));
			return "profile";
		}
		return "login";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.GET)
	public String gotoSignUpPage() {
		return "signup";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.POST)
	public String userProfile(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		userService.addUser(user);
		model.put("user", user);
		return "profile";
	}
	
}