package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.UserRegistrationDto;
import com.app.model.User;
import com.app.repo.UserRepo;

@Service
public class UserLoginService {	

	   @Autowired
	    private UserRepo userRepo;

	    public void registerUser(UserRegistrationDto userRegistrationDto) {
	    	User userLogin = new User();
	        userLogin.setUserId(userRegistrationDto.getUserId());
	        userLogin.setPassword(userRegistrationDto.getPassword());
	        userLogin.setEmail(userRegistrationDto.getEmail());

	        userRepo.save(userLogin);
	    }
}
