package com.app.flat.manager.controller.api;

import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@RequestMapping(
		value = "/api/v1/users",
		consumes = APPLICATION_JSON_VALUE,
		produces = APPLICATION_JSON_VALUE)
public interface UserApi {

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	void register(@RequestBody @Valid RegisterUserRequest request);

}
