package com.app.flat.manager.service.building;

import java.util.List;
import java.util.stream.Collectors;

import com.app.flat.manager.controller.payload.building.BuildingResponse;
import com.app.flat.manager.controller.payload.building.PreviewBuildingResponse;
import com.app.flat.manager.converter.BuildingConverter;
import com.app.flat.manager.exception.AsociationException;
import com.app.flat.manager.model.building.Building;
import com.app.flat.manager.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Service
@RequiredArgsConstructor
public class FindBuildingService {

	private final BuildingRepository buildingRepository;
	private final BuildingConverter buildingConverter;

	public BuildingResponse findById(Long id) {
		Building building = findBuildingOrThrow(id);
		return buildingConverter.fromBuildingToBuildingResponse(building);
	}

	public List<PreviewBuildingResponse> findAllByAsociation(Long asociationId) {
		return buildingRepository
				.findAllByAsociationId(asociationId)
				.stream()
				.map(buildingConverter::fromBuildingToPreviewBuildingResponse)
				.collect(Collectors.toList());
	}

	public Building findBuildingOrThrow(Long id) {
		return buildingRepository
				.findById(id)
				.orElseThrow(AsociationException::buildingNotFound);
	}

}
