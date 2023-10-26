package com.sip.syshumres_exceptions;

public class InvalidIdException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7775907433747101543L;
	
	public static final String DESCRIPTION = "Id no puede ser cero o negativo";
	
	public InvalidIdException() {
		super(DESCRIPTION);
	}
	
	public InvalidIdException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
