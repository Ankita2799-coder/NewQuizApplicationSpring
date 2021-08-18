package com.harbourxquizapp.model;

public class JwtRequest {
String email;
String password;
String username;
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
public JwtRequest(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}
public JwtRequest() {
	super();
}

}
