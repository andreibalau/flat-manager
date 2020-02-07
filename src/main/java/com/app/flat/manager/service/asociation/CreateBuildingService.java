package com.app.flat.manager.service.asociation;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.CreateBuildingRequest;
import com.app.flat.manager.converter.asociation.BuildingConverter;
import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.model.asociation.Building;
import com.app.flat.manager.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Service
@RequiredArgsConstructor
public class CreateBuildingService {

	private final BuildingRepository buildingRepository;
	private final FindAsociationService findAsociationService;
	private final BuildingConverter converter;

	public EntityCreatedResponse create(CreateBuildingRequest request) {
		Asociation asociation = findAsociationService.findAsociationOrThrow(request.getAsociationId());
		Building building = createBuilding(request, asociation);
		return new EntityCreatedResponse(building.getId());
	}

	private Building createBuilding(CreateBuildingRequest request, Asociation asociation) {
		Building building = converter.fromCreateBuildingRequestToBuilding(request);
		building.setAsociation(asociation);
		return buildingRepository.save(building);
	}

}
