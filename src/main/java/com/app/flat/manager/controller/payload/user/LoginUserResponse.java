package com.app.flat.manager.controller.payload.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.flat.manager.model.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

/**
 * Flat Manager
 * Created by catalin on 2/22/2020
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String token;
	@NotNull
	private Role role;
	@Nullable
	private Long asociationId;

}
