package com.app.flat.manager.controller.payload.utility;

import com.app.flat.manager.model.utility.UtilityType;
import com.app.flat.manager.model.utility.Uom;
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
public class UtilityResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private Uom uom;
	@NotNull
	private UtilityType type;
	@NotNull
	private Double price;

}
