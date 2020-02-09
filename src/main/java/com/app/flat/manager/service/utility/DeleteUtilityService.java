package com.app.flat.manager.service.utility;

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
public class DeleteUtilityService {

	private final UtilityRepository utilityRepository;
	private final FindUtilityService findUtilityService;

	public void delete(Long id) {
		Utility utility = findUtilityService.findUtilityOrThrow(id);
		utilityRepository.delete(utility);
	}

}
