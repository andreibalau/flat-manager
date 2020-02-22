package com.app.flat.manager.repository;

import java.util.Optional;

import com.app.flat.manager.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
