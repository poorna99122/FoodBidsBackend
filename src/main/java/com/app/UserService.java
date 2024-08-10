package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
	 @Autowired
	    private UserDao dao;

	    public void saveEntity(Long id, String name) {
	        dao.insertEntity(id, name);
	    }
}
