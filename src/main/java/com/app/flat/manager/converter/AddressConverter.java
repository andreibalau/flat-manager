package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.address.CityResponse;
import com.app.flat.manager.model.address.City;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 05.03.2020
 */
@Component
public class AddressConverter extends BaseConverter {

    public AddressConverter(ModelMapper modelMapper) {
        super(modelMapper);
    }

    public CityResponse fromCityToCityResponse(City city) {
        return map(city, CityResponse.class);
    }

}
