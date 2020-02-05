package com.app.flat.manager.exception;

import org.springframework.http.HttpStatus;

/**
 * flat-manager
 * Created by catalin on 05.02.2020
 */
public class UserException extends AppException {

    public UserException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }

    public static UserException emailAlreadyExists() {
        return new UserException("Email already exists!", HttpStatus.BAD_REQUEST);
    }

}
