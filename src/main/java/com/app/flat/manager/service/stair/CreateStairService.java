package com.app.flat.manager.service.stair;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.stair.CreateStairRequest;
import com.app.flat.manager.model.building.Building;
import com.app.flat.manager.model.stair.Stair;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.StairRepository;
import com.app.flat.manager.service.building.FindBuildingService;
import com.app.flat.manager.service.user.FindUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class CreateStairService {

	private final StairRepository stairRepository;
	private final FindBuildingService findBuildingService;
	private final FindUserService findUserService;

	public EntityCreatedResponse create(CreateStairRequest request) {
		Building building = findBuildingService.findBuildingOrThrow(request.getBuildingId());
		User administrator = findUserService.findUserOrThrow(request.getAdministratorId());
		Stair stair = createStair(request, building, administrator);
		return new EntityCreatedResponse(stair.getId());
	}

	private Stair createStair(CreateStairRequest request, Building building, User administrator) {
		Stair stair = new Stair();
		stair.setName(request.getName());
		stair.setBuilding(building);
		stair.setAdministrator(administrator);
		return stairRepository.save(stair);
	}

}
