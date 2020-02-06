package com.app.flat.manager.controller.payload.user;

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
public class UserDto {

    @NotNull
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

}
