package com.springSecurityControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@ResponseBody
	@GetMapping("/bye")
	public String bye() {
		return "bye bye !!";
	}

}
