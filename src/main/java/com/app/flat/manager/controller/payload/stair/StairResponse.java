package com.app.flat.manager.controller.payload.stair;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.controller.payload.flat.FlatResponse;
import com.app.flat.manager.controller.payload.user.UserResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class StairResponse {

	@NotNull
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private Long buildingId;
	@NotNull
	private Set<@NotNull @Valid FlatResponse> flats;
	private UserResponse administrator;

}
