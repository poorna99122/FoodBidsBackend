package com.app;
import javax.persistence.*;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;	



@Entity
@Table(name="userlogin")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@Column(name = "USERID") // Map to the USER_ID column in the database
    private String userId;

    @Column(name = "PASSWORD") // Map to the PASSWORD column in the database
    private String password;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}

	

	
	
	
}
