package com.ExpressFood.Food.exceptions;

public class AuthenticationFailException extends IllegalArgumentException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AuthenticationFailException(String msg) {
		super(msg);
		
	}

}
