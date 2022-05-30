package io.security.springsecurity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.security.springsecurity.security.authentication.services.UserDetailsServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@GetMapping(value="/")
	public String home() throws Exception {
		return "home";
	}

	@GetMapping(value="/login")
	public String login() throws Exception {
		return "login";
	}

}
