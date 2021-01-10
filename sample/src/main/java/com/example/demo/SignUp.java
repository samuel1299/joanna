package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class SignUp {
	@Id
	private String username;
	private String password;
	public SignUp(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
