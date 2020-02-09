package com.app.flat.manager.controller.payload.asociation;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.controller.payload.address.CityResponse;
import com.app.flat.manager.controller.payload.building.BuildingResponse;
import com.app.flat.manager.controller.payload.utility.UtilityResponse;
import com.app.flat.manager.controller.payload.user.UserResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Getter
@Setter
public class AsociationResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private UserResponse president;
	@NotBlank
	private String address;
	private CityResponse city;
	@NotNull
	private Set<@NotNull @Valid BuildingResponse> buildings;
	@NotNull
	private Set<@NotNull @Valid UtilityResponse> services;
}
