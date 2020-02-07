package com.app.flat.manager.exception;

import org.springframework.http.HttpStatus;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
public class BuildingException extends AppException {

	public BuildingException(String message, HttpStatus httpStatus) {
		super(message, httpStatus);
	}

	public static BuildingException buildingNotFound() {
		return new BuildingException("Building not found!", HttpStatus.NOT_FOUND);
	}

}
