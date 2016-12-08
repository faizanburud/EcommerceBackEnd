package com.yaruis.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class User {
	@Id
	private String User_id;
	@Column
	private String User_name;
	@Column
	private String User_email;
	@Column
	private String User_password;
	@Column
	private String User_pohoneno;

	
	
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_email() {
		return User_email;
	}
	public void setUser_email(String user_email) {
		User_email = user_email;
	}
	public String getUser_password() {
		return User_password;
	}
	public void setUser_password(String user_password) {
		User_password = user_password;
	}
	public String getUser_pohoneno() {
		return User_pohoneno;
	}
	public void setUser_pohoneno(String user_pohoneno) {
		User_pohoneno = user_pohoneno;
	}

	



}
