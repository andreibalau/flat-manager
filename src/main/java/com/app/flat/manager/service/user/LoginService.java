package com.app.flat.manager.service.user;

import java.util.Optional;

import com.app.flat.manager.controller.payload.user.LoginUserRequest;
import com.app.flat.manager.controller.payload.user.LoginUserResponse;
import com.app.flat.manager.exception.UserException;
import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.model.flat.Flat;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.UserRepository;
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
	private final UserRepository userRepository;

	public LoginUserResponse login(LoginUserRequest request) {
		User user = findUserService.findUserOrThrow(request.getUsername());
		validatePassword(request, user);
		String token = jwtTokenUtil.generateToken(user);
		Long asociationId = findAsociationId(user);
		return LoginUserResponse.builder()
				.id(user.getId())
				.token(token)
				.role(user.getRole())
				.asociationId(asociationId)
				.build();
	}

	private Long findAsociationId(User user) {
		return userRepository
				.findAsociationByUserFlat(Optional.ofNullable(user.getFlat())
						.map(Flat::getId)
						.orElse(null))
				.map(Asociation::getId)
				.orElse(null);
	}

	private void validatePassword(LoginUserRequest request, User user) {
		if (!request.getPassword()
				.equals(user.getPassword())) {
			throw UserException.wrongCredentials();
		}
	}

}
