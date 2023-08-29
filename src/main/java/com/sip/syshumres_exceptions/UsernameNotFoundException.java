package com.sip.syshumres_exceptions;

public class UsernameNotFoundException extends Exception {
	private static final long serialVersionUID = 5779086959007345674L;
	
	public static final String DESCRIPTION = "Usuario no encontrado";
	
	public UsernameNotFoundException() {
		super(DESCRIPTION);
	}
	
	public UsernameNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
