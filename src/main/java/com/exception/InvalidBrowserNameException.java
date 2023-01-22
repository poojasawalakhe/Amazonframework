package com.exception;

public class InvalidBrowserNameException extends RuntimeException {
	private String browsername = null;

	public InvalidBrowserNameException(String browsername) {
		this.browsername = browsername;
		
	}
	@Override
	public String getMessage() {
		
		return "Invalid browsername  "+browsername;
	}
	

	
	
}
