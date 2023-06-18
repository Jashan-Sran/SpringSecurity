package com.springSecurityControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springSecurityDAO.SignupDAO;
import com.springSecurityDAO.SignupDAOImpl;
import com.springSecurityDTO.SignupDTO;

@Controller
public class LoginController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SignupDAO signupDAO;
	
	@GetMapping("/loginCustom")
	public String formLogin() {
		return "login";
	}
	
	
	
	@GetMapping("/signup")
	public String signup(@ModelAttribute("signupDto") SignupDTO signupDTO) {
		return "signup";
	}
	
	@PostMapping("/process-signup")
	public String processSignup( SignupDTO signupDTO) {
		
//		before encoding
		System.out.println("Before encoded" + signupDTO);
		
		String encodedPassword = passwordEncoder.encode(signupDTO.getPassword());
		
		signupDTO.setPassword(encodedPassword);
		
//		after encoded
		System.out.println("After encoded" + signupDTO);
		
//		user save logic
		
		signupDAO.save(signupDTO);
		
		
		
		return "redirect:/loginCustom";
	}
}
