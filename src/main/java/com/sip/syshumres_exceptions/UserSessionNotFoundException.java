package com.sip.syshumres_exceptions;

public class UserSessionNotFoundException extends Exception {
	private static final long serialVersionUID = -7070770946445009065L;
	
	public static final String DESCRIPTION = "Se necesita una sesión activa, tiene que loguearse";
	
	public UserSessionNotFoundException() {
		super(DESCRIPTION);
	}
	
	public UserSessionNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
