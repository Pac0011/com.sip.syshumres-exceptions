package com.sip.syshumres_exceptions;

public class IdsEntityNotEqualsException extends Exception {
	private static final long serialVersionUID = -4300826951580294247L;
	
    public static final String DESCRIPTION = "Ids de entidad no coinciden para actualización";
	
	public IdsEntityNotEqualsException() {
		super(DESCRIPTION);
	}
	
	public IdsEntityNotEqualsException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
