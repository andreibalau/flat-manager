package com.app.flat.manager.controller;

import java.util.List;

import com.app.flat.manager.controller.api.FlatApi;
import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.flat.CreateFlatRequest;
import com.app.flat.manager.controller.payload.flat.FlatResponse;
import com.app.flat.manager.controller.payload.flat.PreviewFlatResponse;
import com.app.flat.manager.service.flat.CreateFlatService;
import com.app.flat.manager.service.flat.DeleteFlatService;
import com.app.flat.manager.service.flat.FindFlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@RestController
@RequiredArgsConstructor
public class FlatController implements FlatApi {

	private final CreateFlatService createFlatService;
	private final DeleteFlatService deleteFlatService;
	private final FindFlatService findFlatService;

	@Override
	public EntityCreatedResponse create(CreateFlatRequest request) {
		return createFlatService.create(request);
	}

	@Override
	public void delete(Long id) {
		deleteFlatService.delete(id);
	}

	@Override
	public FlatResponse findById(Long id) {
		return findFlatService.findById(id);
	}

	@Override
	public List<PreviewFlatResponse> findAllByStair(Long stairId) {
		return findFlatService.findAllByStair(stairId);
	}

}
