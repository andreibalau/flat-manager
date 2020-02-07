package com.app.flat.manager.controller;

import java.util.List;

import com.app.flat.manager.controller.api.BuildingApi;
import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.BuildingResponse;
import com.app.flat.manager.controller.payload.asociation.CreateBuildingRequest;
import com.app.flat.manager.controller.payload.asociation.PreviewBuildingResponse;
import com.app.flat.manager.service.asociation.CreateBuildingService;
import com.app.flat.manager.service.asociation.DeleteBuildingService;
import com.app.flat.manager.service.asociation.FindBuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@RestController
@RequiredArgsConstructor
public class BuildingController implements BuildingApi {

	private final CreateBuildingService createBuildingService;
	private final FindBuildingService findBuildingService;
	private final DeleteBuildingService deleteBuildingService;

	@Override
	public EntityCreatedResponse create(CreateBuildingRequest request) {
		return createBuildingService.create(request);
	}

	@Override
	public void delete(Long id) {
		deleteBuildingService.delete(id);
	}

	@Override
	public BuildingResponse findById(Long id) {
		return findBuildingService.findById(id);
	}

	@Override
	public List<PreviewBuildingResponse> findAllByAsociation(Long asociationId) {
		return findBuildingService.findAllByAsociation(asociationId);
	}

}
