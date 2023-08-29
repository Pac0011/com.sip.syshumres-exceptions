package com.sip.syshumres_exceptions;

public class BranchOfficeUserNotFoundException extends Exception {
	private static final long serialVersionUID = 1580513412941692701L;
	
	public static final String DESCRIPTION = "Sucursal de usuario no encontrada";
	
	public BranchOfficeUserNotFoundException() {
		super(DESCRIPTION);
	}
	
	public BranchOfficeUserNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
