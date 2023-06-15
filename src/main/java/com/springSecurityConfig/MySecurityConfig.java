package com.springSecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		String password = passwordEncoder.encode("jashan");
		String password1 = passwordEncoder.encode("jassa");
		auth.inMemoryAuthentication()
		.withUser("jashan")
		.password(password)
		.roles("admin")
		.and()
		.withUser("jassa")
		.password(password1)
		.roles("user");
		
		
		
		System.out.println("here is the password encoder  " + passwordEncoder.encode("jassa") );
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/hello").authenticated()
		.antMatchers("/bye").authenticated()
		.antMatchers("/great/**").permitAll()
		.antMatchers("/loginCustom").permitAll()
		.and()
		.formLogin().loginPage("/loginCustom")
		.and()
		.httpBasic();
	}
	
	

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//	}

}
