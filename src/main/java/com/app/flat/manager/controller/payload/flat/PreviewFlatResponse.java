package com.app.flat.manager.controller.payload.flat;

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
public class PreviewFlatResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private Integer number;

}
