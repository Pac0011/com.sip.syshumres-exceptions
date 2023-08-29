package com.sip.syshumres_exceptions;

public class EmployeeFieldsAlreadyExistException extends Exception {
	private static final long serialVersionUID = 5861170689510220853L;
	
	public static final String DESCRIPTION = "Campo de Empleado ya existe";
	
	public EmployeeFieldsAlreadyExistException() {
		super(DESCRIPTION);
	}
	
	public EmployeeFieldsAlreadyExistException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
