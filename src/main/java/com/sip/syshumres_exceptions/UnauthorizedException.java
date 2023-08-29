package com.sip.syshumres_exceptions;

public class UnauthorizedException extends Exception {
	private static final long serialVersionUID = 4985540392617277198L;
	
	public static final String DESCRIPTION = "No autorizado";
	
	public UnauthorizedException() {
		super(DESCRIPTION);
	}
	
	public UnauthorizedException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
