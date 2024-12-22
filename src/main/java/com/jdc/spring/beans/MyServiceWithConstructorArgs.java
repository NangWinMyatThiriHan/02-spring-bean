package com.jdc.spring.beans;

public class MyServiceWithConstructorArgs {
	
	private String message;
	private String mess;
	
	public MyServiceWithConstructorArgs(String message, String mess) {
		super();
		this.message = message;
		this.mess = mess;
	}
	
	public String showMessage() {
		return message;
	}
	
	public String showMess() {
		return mess;
	}
}
