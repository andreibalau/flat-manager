package com.app.flat.manager.controller.payload.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.model.user.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/22/2020
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String token;
	@NotNull
	private Set<@NotNull Role> roles;

}
