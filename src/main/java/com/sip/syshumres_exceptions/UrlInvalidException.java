package com.sip.syshumres_exceptions;

public class UrlInvalidException extends Exception {
	private static final long serialVersionUID = 2407692853781465824L;
	
	public static final String DESCRIPTION = "Url invalida";
	
	public UrlInvalidException() {
		super(DESCRIPTION);
	}
	
	public UrlInvalidException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}


}
