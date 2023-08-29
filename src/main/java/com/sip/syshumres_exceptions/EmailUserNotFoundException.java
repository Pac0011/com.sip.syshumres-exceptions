package com.sip.syshumres_exceptions;

public class EmailUserNotFoundException extends Exception {
	private static final long serialVersionUID = 3648787836961914106L;
	
	public static final String DESCRIPTION = "El email no existe";
	
	public EmailUserNotFoundException() {
		super(DESCRIPTION);
	}
	
	public EmailUserNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
