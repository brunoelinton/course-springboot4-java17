package com.educandoweb.course.services.services.exceptions;

public class DatabaseException extends RuntimeException {

	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}
}
