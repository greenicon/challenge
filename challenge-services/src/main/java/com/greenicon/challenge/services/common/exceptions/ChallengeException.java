package com.greenicon.challenge.services.common.exceptions;

/**
 * 
 * @createdDate Oct 19, 2014
 */
public class ChallengeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2650480409524328096L;
	
	private static String C_DEFAULT_ERROR_MESSAGE = "Challenge exception";
	
	/**
	 * Exception for Data Not Found
	 */
	public ChallengeException() {
		super(C_DEFAULT_ERROR_MESSAGE);
	}
	
	public ChallengeException(String sMessage) {
		super((!(sMessage==null || sMessage.trim().equals("")))?sMessage:C_DEFAULT_ERROR_MESSAGE);
    }

}
