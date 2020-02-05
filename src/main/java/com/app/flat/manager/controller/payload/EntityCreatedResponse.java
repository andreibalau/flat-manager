package com.app.flat.manager.controller.payload;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntityCreatedResponse {

	@NotNull
	private Long id;

}
