package com.app.flat.manager.controller.payload.flat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import com.app.flat.manager.model.utility.UtilityType;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Getter
@Setter
public class CreateContorRequest {

	@NotBlank
	private String name;
	@NotNull
	private UtilityType type;
	@NotBlank
	private String serial;
	@NotNull
	private BigDecimal initialIndex;
	@NotNull
	private BigDecimal currentIndex;

}
