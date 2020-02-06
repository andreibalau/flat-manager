package com.app.flat.manager.controller.payload.service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.flat.manager.model.asociation.ServiceType;
import com.app.flat.manager.model.asociation.Uom;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/6/2020
 */
@Getter
@Setter
public class CreateServiceRequest {

	@NotBlank
	private String name;
	@NotNull
	private Uom uom;
	@NotNull
	private ServiceType type;
	@NotNull
	private Double price;

}
