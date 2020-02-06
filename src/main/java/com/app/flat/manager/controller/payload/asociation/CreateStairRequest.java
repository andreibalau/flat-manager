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
public class CreateStairRequest {

    private Long buildingId;
    @NotBlank
    private String name;
    @NotNull
    private List<@Valid CreateFlatRequest> flats;
    @NotNull
    private Long administratorId;

}
