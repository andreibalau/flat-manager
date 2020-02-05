package com.app.flat.manager.controller.payload.user;

import com.app.flat.manager.model.user.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Flat Manager
 * Created by catalin on 2/4/2020
 */
@Getter
@Setter
public class RegisterUserRequest {

	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String password;
	@NotNull
	private Role role;
	private String phone;

}
