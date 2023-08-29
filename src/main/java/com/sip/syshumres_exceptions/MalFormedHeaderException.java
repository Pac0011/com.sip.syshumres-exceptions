package com.sip.syshumres_exceptions;

public class MalFormedHeaderException extends Exception {
	private static final long serialVersionUID = 4032064409165692208L;
	
	public static final String DESCRIPTION = "Cabecera mal formada";
	
	public MalFormedHeaderException() {
		super(DESCRIPTION);
	}
	
	public MalFormedHeaderException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
