package com.app.flat.manager.controller;

import com.app.flat.manager.controller.api.AsociationApi;
import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.AsociationResponse;
import com.app.flat.manager.controller.payload.asociation.CreateAsociationRequest;
import com.app.flat.manager.service.asociation.CreateAsociationService;
import com.app.flat.manager.service.asociation.FindAsociationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@RestController
@RequiredArgsConstructor
public class AsociationController implements AsociationApi {

	private final CreateAsociationService createAsociationService;
	private final FindAsociationService findAsociationService;

	@Override
	public EntityCreatedResponse create(CreateAsociationRequest request) {
		return createAsociationService.create(request);
	}

	@Override
	public AsociationResponse findById(Long id) {
		return findAsociationService.findById(id);
	}

}
