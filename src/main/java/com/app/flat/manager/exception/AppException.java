package com.app.flat.manager.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
@Getter
public class AppException extends RuntimeException {

    private final HttpStatus httpStatus;

    public AppException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
