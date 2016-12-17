package com.matija.web.dto;

public class UserRegistrationDTO {
	
	private String username;
	private String email;
	private String password;
	private String confirmedPassword;
	
	
	
	
	public UserRegistrationDTO() {
		super();
	}

	public UserRegistrationDTO(String username, String email, String password, String confirmedPassword) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmedPassword = confirmedPassword;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmedPassword() {
		return confirmedPassword;
	}
	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}
	
	
	
	

}
