package io.security.springsecurity.controller.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.security.springsecurity.service.RoleService;
import io.security.springsecurity.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;
	
	@GetMapping(value="/denied")
	public String accessDenied() throws Exception {

		return "user/login/denied";
	}
}
