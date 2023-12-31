package com.sip.syshumres_exceptions;

public class ErrorMessage {
	
	private String exception;
	
	private String message;
	
	private String path;
	
	public ErrorMessage(Exception ex, String path) {
		this(ex.getClass().getSimpleName(), ex.getMessage(), path);
	}

	public ErrorMessage(String exception, String message, String path) {
		this.exception = exception;
		this.message = message;
		this.path = path;
	}

	public String getException() {
		return exception;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}

	@Override
	public String toString() {
		return "ErrorMessage [exception=" + exception + ", message=" + message + ", path=" + path + "]";
	}

}
