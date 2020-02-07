package com.app.flat.manager.service.asociation;

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
public class DeleteBuildingService {

	private final BuildingRepository buildingRepository;
	private final FindBuildingService findBuildingService;

	public void delete(Long id) {
		Building building = findBuildingService.findBuildingOrThrow(id);
		buildingRepository.delete(building);
	}

}
