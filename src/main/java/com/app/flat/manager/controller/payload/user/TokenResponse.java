package com.app.flat.manager.controller.payload.user;

import javax.validation.constraints.NotBlank;

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
public class TokenResponse {

	@NotBlank
	private String token;

}
