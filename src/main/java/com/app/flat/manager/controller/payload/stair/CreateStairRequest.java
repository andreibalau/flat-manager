package com.app.flat.manager.controller.payload.stair;

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
public class CreateStairRequest {

	private Long buildingId;
	@NotBlank
	private String name;
	@NotNull
	private Long administratorId;

}
