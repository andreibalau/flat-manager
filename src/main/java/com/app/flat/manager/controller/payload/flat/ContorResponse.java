package com.app.flat.manager.controller.payload.flat;

import com.app.flat.manager.model.utility.UtilityType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class ContorResponse {

    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String serial;
    @NotNull
    private UtilityType type;
    @NotNull
    private BigDecimal initialIndex;
    @NotNull
    private BigDecimal currentIndex;

}
