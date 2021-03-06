package com.app.flat.manager.controller.payload.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class UserResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;

}
