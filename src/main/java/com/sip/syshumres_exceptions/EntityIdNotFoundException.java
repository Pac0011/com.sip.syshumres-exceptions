package com.sip.syshumres_exceptions;

public class EntityIdNotFoundException extends Exception {
	private static final long serialVersionUID = -7412794621690268049L;
	
	public static final String DESCRIPTION = "Id de entidad no encontrado";
	
	public EntityIdNotFoundException() {
		super(DESCRIPTION);
	}
	
	public EntityIdNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
