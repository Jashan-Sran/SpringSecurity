package com.springSecurityConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
	
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	}
	
	@Bean
	PasswordEncoder getPasswotd() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource());
		
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/springsecurity");
		dataSource.setUsername("root");
		dataSource.setPassword("jassa@123");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		
		return dataSource;
		
	}
	

}
