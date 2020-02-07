package com.app.flat.manager.controller.payload.address;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class CityResponse {

    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String countyName;
    @NotBlank
    private String countyAbbrev;

}
