package com.app.flat.manager.controller.payload.utility;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.flat.manager.model.utility.UtilityType;
import com.app.flat.manager.model.utility.Uom;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/6/2020
 */
@Getter
@Setter
public class CreateUtilityRequest {

	@NotBlank
	private String name;
	@NotNull
	private Uom uom;
	@NotNull
	private UtilityType type;
	@NotNull
	private Double price;

}
