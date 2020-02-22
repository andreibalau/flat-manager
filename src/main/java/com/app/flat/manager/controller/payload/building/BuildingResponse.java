package com.app.flat.manager.controller.payload.building;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.controller.payload.address.CityResponse;
import com.app.flat.manager.controller.payload.stair.StairResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class BuildingResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private Long asociationId;
	@NotBlank
	private String address;
	@NotNull
	private Set<@NotNull @Valid StairResponse> stairs;
	private CityResponse city;

}
