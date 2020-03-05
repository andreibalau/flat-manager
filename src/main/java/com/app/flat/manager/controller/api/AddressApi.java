package com.app.flat.manager.controller.api;

import com.app.flat.manager.controller.payload.address.CityResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * flat-manager
 * Created by catalin on 05.03.2020
 */
@RequestMapping(
        value = "/api/v1/address",
        consumes = APPLICATION_JSON_VALUE,
        produces = APPLICATION_JSON_VALUE)
public interface AddressApi {

    @GetMapping(value = "/cities")
    List<CityResponse> findAllCities();

}
