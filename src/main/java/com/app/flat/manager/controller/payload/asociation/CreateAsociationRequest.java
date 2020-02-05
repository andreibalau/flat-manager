package com.app.flat.manager.controller.payload.asociation;

import com.app.flat.manager.controller.payload.user.RegisterUserRequest;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * flat-manager
 * Created by catalin on 05.02.2020
 */
@Getter
@Setter
public class CreateAsociationRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String address;
    private Long cityId;
    @Valid
    @NotNull
    private RegisterUserRequest user;

}
