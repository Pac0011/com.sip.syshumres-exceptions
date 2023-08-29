package com.sip.syshumres_exceptions;

public class StatusCatalogNotFoundException extends Exception {
	private static final long serialVersionUID = -3413301366562223700L;
	
	public static final String DESCRIPTION = "Estatus de catalogo no encontrado";
	
	public StatusCatalogNotFoundException() {
		super(DESCRIPTION);
	}
	
	public StatusCatalogNotFoundException(String detail) {
		super(DESCRIPTION + ", " + detail);
	}

}
