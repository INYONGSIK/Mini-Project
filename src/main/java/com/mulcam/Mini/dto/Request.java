package com.mulcam.Mini.dto;

public class Request {
	String name;
	String phone;
	String email;
	String request;
	public Request() {}
	public Request(String name, String phone,String email,String request ) {
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.request=request;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	
}
