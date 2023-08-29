package com.sip.syshumres_exceptions;

public class InvalidFieldException extends Exception {
	private static final long serialVersionUID = -7146215163048058191L;
	
	public static final String DESCRIPTION = "Campo inválido";
	
	public InvalidFieldException() {
		super(DESCRIPTION);
	}
	
	public InvalidFieldException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
