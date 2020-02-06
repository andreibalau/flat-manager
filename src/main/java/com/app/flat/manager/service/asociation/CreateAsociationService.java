package com.app.flat.manager.service.asociation;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.CreateAsociationRequest;
import com.app.flat.manager.model.address.City;
import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.AsociationRepository;
import com.app.flat.manager.repository.CityRepository;
import com.app.flat.manager.service.user.RegisterService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
@Service
@RequiredArgsConstructor
public class CreateAsociationService {

    private final AsociationRepository asociationRepository;
    private final CityRepository cityRepository;
    private final RegisterService registerService;
    private final ModelMapper modelMapper;

    public EntityCreatedResponse create(CreateAsociationRequest request) {
        User user = registerService.registerAndReturn(request.getUser());
        Asociation asociation = modelMapper.map(request, Asociation.class);
        asociation.setCity(findCity(request.getCityId()));
        asociation.setPresident(user);
        Long id = asociationRepository.save(asociation).getId();
        return new EntityCreatedResponse(id);
    }

    private City findCity(Long id) {
        return cityRepository
                .findById(id)
                .orElse(null);
    }

}
