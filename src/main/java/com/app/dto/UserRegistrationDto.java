package com.app.dto;

public class UserRegistrationDto {

		private String userId;
	    private String password;
	    private String email;
	    
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "UserRegistrationDto [userId=" + userId + ", password=" + password + ", email=" + email + "]";
		}
		
		
}
