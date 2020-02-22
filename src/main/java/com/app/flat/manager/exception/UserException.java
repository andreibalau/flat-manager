package com.app.flat.manager.exception;

import org.springframework.http.HttpStatus;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
public class UserException extends AppException {

	public UserException(String message, HttpStatus httpStatus) {
		super(message, httpStatus);
	}

	public static UserException emailAlreadyExists() {
		return new UserException("Email already exists!", HttpStatus.BAD_REQUEST);
	}

	public static UserException userNotFound() {
		return new UserException("User not found!", HttpStatus.NOT_FOUND);
	}

	public static UserException wrongCredentials() {
		return new UserException("Wrong credentials.", HttpStatus.BAD_REQUEST);
	}

}
