package com.sip.syshumres_exceptions;

public class UnknownOptionException extends Exception {
	private static final long serialVersionUID = 5322409955872163078L;
	
	public static final String DESCRIPTION = "Opción seleccionada desconocida";
	
	public UnknownOptionException() {
		super(DESCRIPTION);
	}
	
	public UnknownOptionException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
