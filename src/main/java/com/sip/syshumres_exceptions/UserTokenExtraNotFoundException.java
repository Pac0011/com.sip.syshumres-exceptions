package com.sip.syshumres_exceptions;

public class UserTokenExtraNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1379840821848837473L;
	
    public static final String DESCRIPTION = "No se encuentra los datos extra en el jwt del usuario";
	
	public UserTokenExtraNotFoundException() {
		super(DESCRIPTION);
	}
	
	public UserTokenExtraNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
