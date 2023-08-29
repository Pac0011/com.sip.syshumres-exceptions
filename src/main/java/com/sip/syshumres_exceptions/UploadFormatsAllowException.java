package com.sip.syshumres_exceptions;

public class UploadFormatsAllowException extends Exception {
	private static final long serialVersionUID = -2408004216256124840L;
	
    public static final String DESCRIPTION = "El archivo debe ser del tipo imagen .jpeg ó .png";
	
	public UploadFormatsAllowException() {
		super(DESCRIPTION);
	}
	
	public UploadFormatsAllowException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
