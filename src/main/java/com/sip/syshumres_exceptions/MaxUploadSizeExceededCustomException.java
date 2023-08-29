package com.sip.syshumres_exceptions;

public class MaxUploadSizeExceededCustomException extends Exception {
	private static final long serialVersionUID = 2210456618632440161L;
	
	public static final String DESCRIPTION = "Limite de tamaño de archivo sobrepasado";
	
	public MaxUploadSizeExceededCustomException() {
		super(DESCRIPTION);
	}
	
	public MaxUploadSizeExceededCustomException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
