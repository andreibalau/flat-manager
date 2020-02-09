package com.app.flat.manager.controller.payload.asociation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

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
    private Set<@NotNull Long> contorIds;
    @NotNull
    private Set<@NotNull Long> userIds;
    @NotNull
    private Long stairId;

}
