package com.greenicon.challenge.services.common.exceptions;

/**
 * 
 * @createdDate Oct 19, 2014
 */
public class InvalidInputException extends ChallengeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -13490092855575647L;
	
	private static String C_DEFAULT_ERROR_MESSAGE = "Input Not Valid";
	
	/**
	 * 
	 */
	public InvalidInputException() {
		super(C_DEFAULT_ERROR_MESSAGE);
	}

	public InvalidInputException(String sMessage){
		super((!(sMessage==null || sMessage.trim().equals("")))?sMessage:C_DEFAULT_ERROR_MESSAGE);
	}
}
