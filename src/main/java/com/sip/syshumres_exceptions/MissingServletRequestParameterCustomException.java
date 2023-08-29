package com.sip.syshumres_exceptions;

public class MissingServletRequestParameterCustomException extends Exception {
	private static final long serialVersionUID = -8199215882150051906L;
	
	public static final String DESCRIPTION = "Falta paramentro en la petición";
	
	public MissingServletRequestParameterCustomException() {
		super(DESCRIPTION);
	}
	
	public MissingServletRequestParameterCustomException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
