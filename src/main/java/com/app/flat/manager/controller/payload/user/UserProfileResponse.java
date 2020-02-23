package com.app.flat.manager.controller.payload.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.flat.manager.model.user.Role;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/23/2020
 */
@Getter
@Setter
public class UserProfileResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	@Email
	@NotBlank
	private String email;
	private String phone;
	@NotNull
	private Role role;
	@NotNull
	private Boolean paid;

}
