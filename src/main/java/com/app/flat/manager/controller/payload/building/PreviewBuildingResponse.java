package com.app.flat.manager.controller.payload.building;

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
public class PreviewBuildingResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;

}
