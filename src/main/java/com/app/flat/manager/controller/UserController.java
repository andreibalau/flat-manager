package com.app.flat.manager.controller;

import com.app.flat.manager.controller.api.UserApi;
import com.app.flat.manager.controller.payload.user.LoginUserRequest;
import com.app.flat.manager.controller.payload.user.LoginUserResponse;
import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import com.app.flat.manager.controller.payload.user.UserProfileResponse;
import com.app.flat.manager.service.user.FindUserService;
import com.app.flat.manager.service.user.LoginService;
import com.app.flat.manager.service.user.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

	private final RegisterService registerService;
	private final LoginService loginService;
	private final FindUserService findUserService;

	@Override
	public void register(RegisterUserRequest request) {
		registerService.register(request);
	}

	@Override
	public LoginUserResponse login(LoginUserRequest request) {
		return loginService.login(request);
	}

	@Override
	public UserProfileResponse getProfile(Long id) {
		return findUserService.getProfile(id);
	}

}
