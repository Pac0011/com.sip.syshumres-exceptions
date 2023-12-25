package com.sip.syshumres_exceptions;

public class JwtNotFoundException extends Exception {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -5766105208531681909L;
	
	public static final String DESCRIPTION = "No existe el Jwt del usuario";
	
	public JwtNotFoundException() {
		super(DESCRIPTION);
	}
	
	public JwtNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
