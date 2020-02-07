package com.app.flat.manager.controller.payload.asociation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Getter
@Setter
public class PreviewStairResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;

}
