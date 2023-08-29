package com.sip.syshumres_exceptions;

public class CreateRegisterException extends Exception {
	private static final long serialVersionUID = 1984729276982850469L;
	
	public static final String DESCRIPTION = "No se pudo crear registro en db";
	
	public CreateRegisterException() {
		super(DESCRIPTION);
	}
	
	public CreateRegisterException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
