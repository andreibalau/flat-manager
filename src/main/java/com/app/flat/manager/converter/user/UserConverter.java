package com.app.flat.manager.converter.user;

import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import com.app.flat.manager.model.user.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
@RequiredArgsConstructor
public class UserConverter {

	private final ModelMapper modelMapper;

	public User fromRegisterUserRequestToUser(RegisterUserRequest request) {
		return modelMapper.map(request, User.class);
	}

}
