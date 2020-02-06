package com.app.flat.manager.controller.payload.asociation;

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
public class CreateFlatRequest {

    @NotBlank
    private String name;
    @NotNull
    private Integer number;
    @NotNull
    private Integer numberOfPersons;
    @NotNull
    private Double totalSurface;
    @NotNull
    private Double usedSurface;
    @NotNull
    private List<@NotNull Long> contorIds;
    @NotNull
    private List<@NotNull Long> userIds;

}
