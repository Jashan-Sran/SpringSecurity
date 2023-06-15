package com.springSecurityControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

	@GetMapping("/great/{yourName}")
	public String yourName(@PathVariable("yourName") String yourName) {
	              
		return " Good Morning " + yourName;
	}
	
}
