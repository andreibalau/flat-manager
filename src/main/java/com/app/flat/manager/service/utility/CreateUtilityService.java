package com.app.flat.manager.service.utility;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import com.app.flat.manager.controller.payload.utility.CreateUtilityRequest;
import com.app.flat.manager.converter.UtilityConverter;
import com.app.flat.manager.model.utility.Utility;
import com.app.flat.manager.repository.UtilityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class CreateUtilityService {

	private final UtilityRepository utilityRepository;
	private final UtilityConverter utilityConverter;

	public EntityCreatedResponse create(CreateUtilityRequest request) {
		Utility utility = createUtility(request);
		return new EntityCreatedResponse(utility.getId());
	}

	private Utility createUtility(CreateUtilityRequest request) {
		Utility utility = utilityConverter.fromCreateUtilityRequestToUtility(request);
		return utilityRepository.save(utility);
	}

}
