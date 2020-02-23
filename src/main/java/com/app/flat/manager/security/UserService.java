package com.app.flat.manager.security;

import java.util.Collection;
import java.util.Collections;

import com.app.flat.manager.exception.UserException;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/21/2020
 */
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		User user = userRepository
				.findByEmail(username)
				.orElseThrow(UserException::userNotFound);
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getRoles(user));
	}

	private Collection<? extends GrantedAuthority> getRoles(User user) {
		return Collections.singletonList(
				new SimpleGrantedAuthority(user
						.getRole()
						.name()));
	}
}
