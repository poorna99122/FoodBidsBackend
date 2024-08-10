package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	  @Autowired
	    private JdbcTemplate jdbcTemplate;

	    public int insertEntity(Long id, String name) {
	        String sql = "INSERT INTO USERS (ID, NAME) VALUES (10, 'Testing')";
	        return jdbcTemplate.update(sql, id, name);
	    }
}
