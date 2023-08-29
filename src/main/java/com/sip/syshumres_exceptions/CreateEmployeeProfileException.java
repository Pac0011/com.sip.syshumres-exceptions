package com.sip.syshumres_exceptions;

public class CreateEmployeeProfileException extends Exception {
	private static final long serialVersionUID = -7017044176584488502L;
	
	public static final String DESCRIPTION = "No se pudo crear el empleado, valide con el Administrador";
	
	public CreateEmployeeProfileException() {
		super(DESCRIPTION);
	}
	
	public CreateEmployeeProfileException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
