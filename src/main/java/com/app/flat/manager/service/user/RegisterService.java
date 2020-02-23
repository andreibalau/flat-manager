package com.app.flat.manager.service.user;

import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import com.app.flat.manager.converter.UserConverter;
import com.app.flat.manager.exception.UserException;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
@Service
@RequiredArgsConstructor
public class RegisterService {

    private final EmailCheckService emailCheckService;
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public void register(RegisterUserRequest request) {
        createUser(request);
    }

    public User registerAndReturn(RegisterUserRequest request) {
        return createUser(request);
    }

    private User createUser(RegisterUserRequest request) {
        boolean exists = emailCheckService.exists(request.getEmail());
        if (exists) {
            throw UserException.emailAlreadyExists();
        }
        User user = userConverter.fromRegisterUserRequestToUser(request);
        user.setPaid(false);
        user.setRoles(Collections.singleton(request.getRole()));
        return userRepository.save(user);
    }

}
