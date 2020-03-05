package com.app.flat.manager.service.address;

import com.app.flat.manager.controller.payload.address.CityResponse;
import com.app.flat.manager.converter.AddressConverter;
import com.app.flat.manager.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Flat Manager
 * Created by catalin on 05.03.2020
 */
@Service
@RequiredArgsConstructor
public class FindCityService {

    private final CityRepository repository;
    private final AddressConverter converter;

    public List<CityResponse> findAll() {
        return repository
                .findAll()
                .stream()
                .map(converter::fromCityToCityResponse)
                .collect(Collectors.toList());
    }

}
