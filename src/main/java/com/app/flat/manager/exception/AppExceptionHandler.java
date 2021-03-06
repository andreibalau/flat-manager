package com.app.flat.manager.exception;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import java.util.List;
import java.util.stream.Collectors;

import com.app.flat.manager.controller.payload.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = AppException.class)
	public ResponseEntity<ErrorResponse> handleException(AppException exception) {
		return buildResponse(exception.getHttpStatus(), exception.getMessage());
	}

	@ExceptionHandler(value = BindException.class)
	public ResponseEntity<ErrorResponse> handleException(BindException exception) {
		return buildResponse(HttpStatus.BAD_REQUEST, collectErrors(exception));
	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleException(MethodArgumentNotValidException exception) {
		return buildResponse(HttpStatus.BAD_REQUEST, collectErrors(exception));
	}

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> handleException(HttpMessageNotReadableException exception) {
		return buildResponse(HttpStatus.BAD_REQUEST, exception.getMessage());
	}

	@ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ErrorResponse> handleException(HttpRequestMethodNotSupportedException exception) {
		return buildResponse(HttpStatus.METHOD_NOT_ALLOWED, exception.getMessage());
	}

	@ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
	public ResponseEntity<ErrorResponse> handleException(HttpMediaTypeNotSupportedException exception) {
		return buildResponse(HttpStatus.UNSUPPORTED_MEDIA_TYPE, exception.getMessage());
	}

	@ExceptionHandler(value = Throwable.class)
	public ResponseEntity<ErrorResponse> handleException(Throwable exception) {
		return buildResponse(INTERNAL_SERVER_ERROR, exception.getMessage());
	}

	private List<String> collectErrors(MethodArgumentNotValidException exception) {
		return exception
				.getBindingResult()
				.getFieldErrors()
				.stream()
				.map(fieldError -> fieldError.getField() + " " + fieldError.getDefaultMessage())
				.collect(Collectors.toList());
	}

	private List<String> collectErrors(BindException exception) {
		return exception
				.getBindingResult()
				.getFieldErrors()
				.stream()
				.map(fieldError -> fieldError.getField() + " " + fieldError.getDefaultMessage())
				.collect(Collectors.toList());
	}

	private ResponseEntity<ErrorResponse> buildResponse(HttpStatus httpStatus, List<String> errorMessages) {
		String errorMessage = String.join(", ", errorMessages.toArray(new String[0]));
		return buildResponse(httpStatus, errorMessage);
	}

	private ResponseEntity<ErrorResponse> buildResponse(HttpStatus httpStatus, String errorMessage) {
		return ResponseEntity
				.status(httpStatus)
				.body(new ErrorResponse(errorMessage));
	}

}
