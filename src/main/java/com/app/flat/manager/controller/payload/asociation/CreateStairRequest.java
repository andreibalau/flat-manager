package com.app.flat.manager.controller.payload.asociation;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * flat-manager
 * Created by catalin on 06.02.2020
 */
@Getter
@Setter
public class CreateStairRequest {

    @NotBlank
    private String name;

}
