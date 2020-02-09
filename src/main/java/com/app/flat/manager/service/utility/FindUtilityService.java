package com.app.flat.manager.service.utility;

import java.util.List;
import java.util.stream.Collectors;

import com.app.flat.manager.controller.payload.utility.PreviewUtilityResponse;
import com.app.flat.manager.controller.payload.utility.UtilityResponse;
import com.app.flat.manager.converter.UtilityConverter;
import com.app.flat.manager.exception.AsociationException;
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
public class FindUtilityService {

	private final UtilityRepository utilityRepository;
	private final UtilityConverter utilityConverter;

	public UtilityResponse findById(Long id) {
		Utility utility = findUtilityOrThrow(id);
		return utilityConverter.fromUtilityToUtilityResponse(utility);
	}

	public List<PreviewUtilityResponse> findAll() {
		return utilityRepository
				.findAll()
				.stream()
				.map(utilityConverter::fromUtilityToPreviewUtilityResponse)
				.collect(Collectors.toList());
	}

	public Utility findUtilityOrThrow(Long id) {
		return utilityRepository
				.findById(id)
				.orElseThrow(AsociationException::utilityNotFound);
	}

}
