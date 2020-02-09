package com.app.flat.manager.exception;

import org.springframework.http.HttpStatus;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
public class AsociationException extends AppException {

	public AsociationException(String message, HttpStatus httpStatus) {
		super(message, httpStatus);
	}

	public static AsociationException asociationNotFound() {
		return new AsociationException("Asociation not found!", HttpStatus.NOT_FOUND);
	}

	public static AsociationException buildingNotFound() {
		return new AsociationException("Building not found!", HttpStatus.NOT_FOUND);
	}

	public static AsociationException stairNotFound() {
		return new AsociationException("Stair not found!", HttpStatus.NOT_FOUND);
	}

}
