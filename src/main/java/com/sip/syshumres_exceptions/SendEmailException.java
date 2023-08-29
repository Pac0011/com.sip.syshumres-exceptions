package com.sip.syshumres_exceptions;

public class SendEmailException extends Exception {
	private static final long serialVersionUID = 2569351461470445443L;
	
	public static final String DESCRIPTION = "No se pudo enviar el email";
	
	public SendEmailException() {
		super(DESCRIPTION);
	}
	
	public SendEmailException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
