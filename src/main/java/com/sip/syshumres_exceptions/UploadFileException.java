package com.sip.syshumres_exceptions;

public class UploadFileException extends Exception {
	private static final long serialVersionUID = -275390871675272329L;
	
	public static final String DESCRIPTION = "No se pudo subir el archivo";
	
	public UploadFileException() {
		super(DESCRIPTION);
	}
	
	public UploadFileException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
