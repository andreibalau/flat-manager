package com.app.flat.manager.controller.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.validation.Valid;

import com.app.flat.manager.controller.payload.user.LoginUserRequest;
import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import com.app.flat.manager.controller.payload.user.TokenResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	@PostMapping("/register")
	void register(@RequestBody @Valid RegisterUserRequest request);

	@PostMapping("/login")
	TokenResponse login(@RequestBody LoginUserRequest request);

}
