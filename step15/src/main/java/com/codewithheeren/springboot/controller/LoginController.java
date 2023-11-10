package com.codewithheeren.springboot.controller;

import java.time.LocalDate;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.GET)
	public String gotoSignUpPage(ModelMap model) {
		//-----------------------Don't forget to add this user object--------------------------
		model.put("user", new User());
		return "signup";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.POST)  //Note- always put binding result object just after pojo object.
	public String userProfile(@Valid @ModelAttribute("user") User user,BindingResult result ,ModelMap model) { 
		model.put("user", user);
		if(result.hasErrors()) {
			return "signup";
		}
		userService.addUser(user);
		return "profile";
	}
	
}