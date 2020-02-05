package com.app.flat.manager.service.user;

import com.app.flat.manager.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * flat-manager
 * Created by catalin on 05.02.2020
 */
@Service
@RequiredArgsConstructor
public class EmailCheckService {

    private final UserRepository repository;

    public boolean exists(String email) {
        return repository
                .findByEmail(email)
                .isPresent();
    }

}
