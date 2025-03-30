package com.keyword.exceptions;

public class InvalidBrowserNameException extends RuntimeException {
	
	
	private String browsername;
 public InvalidBrowserNameException(String browsername) {
	this.browsername=browsername;
	
}
 @Override
public String getMessage() {
	// TODO Auto-generated method stub
	return browsername;
}
	
	
	

}
