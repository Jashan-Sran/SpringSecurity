package com.springSecurityControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/loginCustom")
	public String formLogin() {
		return "login";
	}
	
}
