package com.app.flat.manager.service.building;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.building.CreateBuildingRequest;
import com.app.flat.manager.converter.BuildingConverter;
import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.model.building.Building;
import com.app.flat.manager.repository.BuildingRepository;
import com.app.flat.manager.service.asociation.FindAsociationService;
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
