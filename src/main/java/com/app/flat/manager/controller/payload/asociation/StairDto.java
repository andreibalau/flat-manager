package com.app.flat.manager.controller.payload.asociation;

import com.app.flat.manager.controller.payload.user.UserDto;
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
public class StairDto {

    @NotBlank
    private String name;
    @NotNull
    private Long buildingId;
    @NotNull
    private List<@NotNull FlatDto> flats;
    private UserDto administrator;

}
