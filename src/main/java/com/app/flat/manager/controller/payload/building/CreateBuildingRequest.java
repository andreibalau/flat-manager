package com.app.flat.manager.controller.payload.building;

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
public class CreateBuildingRequest {

	@NotNull
	private Long asociationId;
	@NotBlank
	private String name;
	@NotBlank
	private String address;
	private Long cityId;

}
