package com.app.flat.manager.controller.payload.asociation;

import com.app.flat.manager.model.asociation.ServiceType;
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
    private ServiceType type;
    @NotNull
    private BigDecimal initialIndex;
    @NotNull
    private BigDecimal currentIndex;

}
