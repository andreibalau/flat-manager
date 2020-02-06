package com.app.flat.manager.controller.payload.service;

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
public class ServiceDto {

	private Long id;
	private String name;
	private Uom uom;
	private ServiceType type;
	private Double price;

}
