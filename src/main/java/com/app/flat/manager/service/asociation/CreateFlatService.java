package com.app.flat.manager.service.asociation;

import java.util.Set;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.asociation.CreateFlatRequest;
import com.app.flat.manager.converter.asociation.FlatConverter;
import com.app.flat.manager.model.asociation.Flat;
import com.app.flat.manager.model.asociation.Stair;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.repository.FlatRepository;
import com.app.flat.manager.service.user.FindUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class CreateFlatService {

	private final FlatRepository flatRepository;
	private final FindStairService findStairService;
	private final FindUserService findUserService;
	private final FlatConverter flatConverter;

	public EntityCreatedResponse create(CreateFlatRequest request) {
		Stair stair = findStairService.findStairOrThrow(request.getStairId());
		Set<User> users = findUserService.findUsers(request.getUserIds());
		Flat flat = createFlat(request, stair, users);
		return new EntityCreatedResponse(flat.getId());
	}

	private Flat createFlat(CreateFlatRequest request, Stair stair, Set<User> users) {
		Flat flat = flatConverter.fromCreateFlatRequestToFlat(request);
		flat.setStair(stair);
		flat.setUsers(users);
		return flatRepository.save(flat);
	}

}
