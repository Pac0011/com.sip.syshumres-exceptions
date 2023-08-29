package com.sip.syshumres_exceptions;

public class FatherAssignException extends Exception {
	private static final long serialVersionUID = -7691540721035869501L;
	
	public static final String DESCRIPTION = "El padre no puede asignado al mismo registro";
	
	public FatherAssignException() {
		super(DESCRIPTION);
	}
	
	public FatherAssignException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
