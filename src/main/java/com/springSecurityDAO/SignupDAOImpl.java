package com.springSecurityDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springSecurityDTO.SignupDTO;

@Repository
public class SignupDAOImpl implements SignupDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public SignupDTO save(SignupDTO signupDTO) {
		
		String sql = "insert into users values(?,?,?)";
		String sql2 = "insert into authorities values(?,?)";
		
		jdbcTemplate.update(sql,signupDTO.getUsername(),signupDTO.getPassword(),1);
		jdbcTemplate.update(sql2,signupDTO.getUsername(), "USER");
	
		return null;
		
	}

}
