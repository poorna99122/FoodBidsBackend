package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserRegistrationDto;
import com.app.model.User;
import com.app.repo.UserRepo;
import com.app.service.UserLoginService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins =  "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@CrossOrigin(origins = "http://localhost:9091")
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User userData){
		System.out.println(userData);
		System.out.println(userData.getUserId());
		System.out.println(userData.getPassword());
		System.out.println(repo.findAll());
		
	
		User user = repo.findByUserId(userData.getUserId());
		
		
		 if (user == null) {
	            return ResponseEntity.status(404).body("User not found");
	        }
		
		if(user.getPassword().equals(userData.getPassword())) {
			return ResponseEntity.ok(user);
			
		}else {
			
			return ResponseEntity.status(401).body("Invalid credentials");
		}
	}
	
	
	  @Autowired
	    private UserLoginService userLoginService;

	    @PostMapping("/register")
	    public ResponseEntity<Map<String, String>> registerUser(@RequestBody UserRegistrationDto userRegistrationDto) {
	        userLoginService.registerUser(userRegistrationDto);
	        Map<String, String> response = new HashMap<String, String>();
	        response.put("message", "User registered successfully");
	        return new ResponseEntity<Map<String, String>>(response, HttpStatus.OK);
	    }
	
	
	
}
