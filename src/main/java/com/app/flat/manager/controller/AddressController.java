package com.app.flat.manager.controller;

import com.app.flat.manager.controller.api.AddressApi;
import com.app.flat.manager.controller.payload.address.CityResponse;
import com.app.flat.manager.service.address.FindCityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Flat Manager
 * Created by catalin on 05.03.2020
 */
@RestController
@RequiredArgsConstructor
public class AddressController implements AddressApi {

    private final FindCityService findCityService;

    @Override
    public List<CityResponse> findAllCities() {
        return findCityService.findAll();
    }

}
