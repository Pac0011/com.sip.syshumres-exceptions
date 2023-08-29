package com.sip.syshumres_exceptions;

public class ChangePasswordException extends Exception {
	private static final long serialVersionUID = 5725127862267201766L;
	
	public static final String DESCRIPTION = "No se pudo cambiar la contraseña";
	
	public ChangePasswordException() {
		super(DESCRIPTION);
	}
	
	public ChangePasswordException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
