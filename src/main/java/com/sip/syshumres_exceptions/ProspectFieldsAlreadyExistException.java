package com.sip.syshumres_exceptions;

public class ProspectFieldsAlreadyExistException extends Exception {
	private static final long serialVersionUID = -8481772193217193825L;
	
	public static final String DESCRIPTION = "Campo de Prospecto ya existe";
	
	public ProspectFieldsAlreadyExistException() {
		super(DESCRIPTION);
	}
	
	public ProspectFieldsAlreadyExistException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
