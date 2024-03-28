package com.error.exception;

public class InvalidBrwserName extends Error {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid Browser name.Please enter valid browser name";
	}

}
