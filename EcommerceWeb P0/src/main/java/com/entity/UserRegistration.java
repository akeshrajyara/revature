package com.entity;

public class UserRegistration {
	private int user_id;
	private String user_first_name;
	private String user_last_name;
	private String user_email;
	private String user_password; 
	private long user_phonenumber;
	private String user_address;
	private String role;
	
	public UserRegistration(int user_id, String user_first_name, String user_last_name, String user_email,
			String user_password, long user_phonenumber, String user_address, String role) {
		super();
		this.user_id = user_id;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_phonenumber = user_phonenumber;
		this.user_address = user_address;
		this.role=role;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public long getUser_phonenumber() {
		return user_phonenumber;
	}
	public void setUser_phonenumber(long user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	} 
	
	
}
