package com.app.flat.manager.controller.payload.flat;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.controller.payload.user.UserResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class FlatResponse {

    @NotNull
    private Long id;
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
    private Set<@NotNull @Valid ContorResponse> contors;
    @NotNull
    private Set<@NotNull @Valid UserResponse> users;

}
