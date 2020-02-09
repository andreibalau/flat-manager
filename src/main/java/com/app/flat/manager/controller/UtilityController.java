package com.app.flat.manager.controller;

import java.util.List;

import com.app.flat.manager.controller.api.UtilityApi;
import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.utility.CreateUtilityRequest;
import com.app.flat.manager.controller.payload.utility.PreviewUtilityResponse;
import com.app.flat.manager.controller.payload.utility.UtilityResponse;
import com.app.flat.manager.service.utility.CreateUtilityService;
import com.app.flat.manager.service.utility.DeleteUtilityService;
import com.app.flat.manager.service.utility.FindUtilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@RestController
@RequiredArgsConstructor
public class UtilityController implements UtilityApi {

	private final CreateUtilityService createUtilityService;
	private final FindUtilityService findUtilityService;
	private final DeleteUtilityService deleteUtilityService;

	@Override
	public EntityCreatedResponse create(CreateUtilityRequest request) {
		return createUtilityService.create(request);
	}

	@Override
	public void delete(Long id) {
		deleteUtilityService.delete(id);
	}

	@Override
	public List<PreviewUtilityResponse> findAll() {
		return findUtilityService.findAll();
	}

	@Override
	public UtilityResponse findById(Long id) {
		return findUtilityService.findById(id);
	}

}
