package com.springSecurityConfig;

import javax.sql.DataSource;

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
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
//	load user from database
		
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(NoOpPasswordEncoder.getInstance());
		
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
		.httpBasic()
		.and()
		.logout();
//		http.csrf().disable();
	}
	
	

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//	}

}
