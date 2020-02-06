package com.app.flat.manager.controller.payload.asociation;

import com.app.flat.manager.controller.payload.address.CityDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class BuildingDto {

    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    private Long asociationId;
    @NotBlank
    private String address;
    @NotNull
    private List<@NotNull StairDto> stairs;
    private CityDto city;

}
