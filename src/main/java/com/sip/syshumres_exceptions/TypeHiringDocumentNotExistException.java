package com.sip.syshumres_exceptions;

public class TypeHiringDocumentNotExistException extends Exception {
	private static final long serialVersionUID = 6639021080295286833L;
	
	public static final String DESCRIPTION = "El tipo de documento no existe";
	
	public TypeHiringDocumentNotExistException() {
		super(DESCRIPTION);
	}
	
	public TypeHiringDocumentNotExistException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
