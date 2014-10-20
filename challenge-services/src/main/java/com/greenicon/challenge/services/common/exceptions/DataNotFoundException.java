package com.greenicon.challenge.services.common.exceptions;

/**
 * 
 * @createdDate Oct 19, 2014
 */
public class DataNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2767301690122796840L;
	
	private static String C_DEFAULT_ERROR_MESSAGE = "Data Not Found";
	
	/**
	 * Exception for Data Not Found
	 */
	public DataNotFoundException() {
		super(C_DEFAULT_ERROR_MESSAGE);
	}
	
	public DataNotFoundException(String sMessage) {
		super((!(sMessage==null || sMessage.trim().equals("")))?sMessage:C_DEFAULT_ERROR_MESSAGE);
    }

}
