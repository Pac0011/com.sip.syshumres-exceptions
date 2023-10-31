package com.sip.syshumres_exceptions;

public class MethodArgumentTypeMismatchCustomException extends Exception{
	private static final long serialVersionUID = -2872415127495292941L;
	
	public static final String DESCRIPTION = "El tipo del argumento esperado no coincide con el valor enviado";
	
	public MethodArgumentTypeMismatchCustomException() {
		super(DESCRIPTION);
	}
	
	public MethodArgumentTypeMismatchCustomException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
