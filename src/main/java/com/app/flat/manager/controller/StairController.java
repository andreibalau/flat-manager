package com.app.flat.manager.controller;

import java.util.List;

import com.app.flat.manager.controller.api.StairApi;
import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.CreateStairRequest;
import com.app.flat.manager.controller.payload.asociation.PreviewStairResponse;
import com.app.flat.manager.controller.payload.asociation.StairResponse;
import com.app.flat.manager.service.asociation.CreateStairService;
import com.app.flat.manager.service.asociation.DeleteStairService;
import com.app.flat.manager.service.asociation.FindStairService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@RestController
@RequiredArgsConstructor
public class StairController implements StairApi {

	private final CreateStairService createStairService;
	private final DeleteStairService deleteStairService;
	private final FindStairService findStairService;

	@Override
	public EntityCreatedResponse create(CreateStairRequest request) {
		return createStairService.create(request);
	}

	@Override
	public void delete(Long id) {
		deleteStairService.delete(id);
	}

	@Override
	public StairResponse findById(Long id) {
		return findStairService.findById(id);
	}

	@Override
	public List<PreviewStairResponse> findAllByBuilding(Long buildingId) {
		return findStairService.findAllByBuilding(buildingId);
	}

}
