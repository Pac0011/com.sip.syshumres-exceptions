package com.sip.syshumres_exceptions;

public class UpdateRegisterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8999779417711541845L;
	
    public static final String DESCRIPTION = "No se pudo actualizar el registro, valide la información";
	
	public UpdateRegisterException() {
		super(DESCRIPTION);
	}
	
	public UpdateRegisterException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
