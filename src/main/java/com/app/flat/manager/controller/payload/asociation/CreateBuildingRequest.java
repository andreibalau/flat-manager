package com.app.flat.manager.controller.payload.asociation;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class CreateBuildingRequest {

    @NotNull
    private Long asociationId;
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotNull
    private List<@Valid CreateStairRequest> stairs;
    private Long cityId;

}
