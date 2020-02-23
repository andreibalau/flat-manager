package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import com.app.flat.manager.controller.payload.user.UserProfileResponse;
import com.app.flat.manager.model.user.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
public class UserConverter extends BaseConverter {

	public UserConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public User fromRegisterUserRequestToUser(RegisterUserRequest request) {
		return map(request, User.class);
	}

	public UserProfileResponse fromUserToUserProfileProfile(User user) {
		return map(user, UserProfileResponse.class);
	}

}
