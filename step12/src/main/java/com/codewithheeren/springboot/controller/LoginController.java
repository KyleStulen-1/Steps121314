package com.codewithheeren.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.codewithheeren.springboot.service.AuthenticationService;

@Controller
public class LoginController {

	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	// login?name=codewithheeren&password=password
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {
			model.put("username", name);
			// Authentication
			// name - heeren
			// password - 123

			return "welcome";
		}
		return "login";
	}

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String gotoSignUpPage() {
		return "signup";
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	// login?name=codewithheeren&password=password
	public String userProfile(@RequestParam String username, @RequestParam String password,
			@RequestParam String firstname, @RequestParam String lastname, ModelMap model) {
//		System.out.println(username);
//		System.out.println(firstname+" "+lastname);
		model.put("name", firstname + " " + lastname);
		model.put("username", username);
		return "welcome";
	}

}