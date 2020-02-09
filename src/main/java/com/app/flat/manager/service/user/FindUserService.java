package com.app.flat.manager.service.user;

import com.app.flat.manager.exception.UserException;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class FindUserService {

	private final UserRepository userRepository;

	public User findUserOrThrow(Long id) {
		return userRepository
				.findById(id)
				.orElseThrow(UserException::userNotFound);
	}

	public User findUserOrThrow(String email) {
		return userRepository
				.findByEmail(email)
				.orElseThrow(UserException::userNotFound);
	}

}
