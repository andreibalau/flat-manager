package com.app.flat.manager.security;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.flat.manager.controller.payload.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/21/2020
 */
@Component
public class FailedEntryPointHandler implements AccessDeniedHandler, AuthenticationEntryPoint {

	@Override
	public void commence(
			HttpServletRequest request,
			HttpServletResponse response,
			AuthenticationException authException)
			throws IOException {
		writeResponse(response);
	}

	@Override
	public void handle(
			HttpServletRequest request,
			HttpServletResponse response,
			AccessDeniedException accessDeniedException)
			throws IOException {
		writeResponse(response);
	}

	private void writeResponse(HttpServletResponse response) throws IOException {
		response
				.getWriter()
				.write(
						new ObjectMapper()
								.writeValueAsString(new ErrorResponse("You are not allowed to access this.")));
		response.addHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE);
		response.setStatus(HttpStatus.FORBIDDEN.value());
	}
}
