package com.app.flat.manager.controller.payload.service;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Flat Manager
 * Created by catalin on 2/6/2020
 */
@Getter
@Setter
public class PreviewServiceResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;

}
