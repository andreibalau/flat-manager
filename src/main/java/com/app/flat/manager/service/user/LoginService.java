package com.app.flat.manager.service.user;

import com.app.flat.manager.controller.payload.user.LoginUserRequest;
import com.app.flat.manager.controller.payload.user.LoginUserResponse;
import com.app.flat.manager.exception.UserException;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.security.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/22/2020
 */
@Service
@RequiredArgsConstructor
public class LoginService {

	private final FindUserService findUserService;
	private final JwtTokenUtil jwtTokenUtil;

	public LoginUserResponse login(LoginUserRequest request) {
		User user = findUserService.findUserOrThrow(request.getUsername());
		validatePassword(request, user);
		String token = jwtTokenUtil.generateToken(user);
		return new LoginUserResponse(user.getId(), token, user.getRoles());
	}

	private void validatePassword(LoginUserRequest request, User user) {
		if (!request.getPassword()
				.equals(user.getPassword())) {
			throw UserException.wrongCredentials();
		}
	}

}
