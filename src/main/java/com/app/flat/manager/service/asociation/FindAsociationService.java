package com.app.flat.manager.service.asociation;

import com.app.flat.manager.controller.payload.asociation.AsociationResponse;
import com.app.flat.manager.converter.asociation.AsociationConverter;
import com.app.flat.manager.exception.AsociationException;
import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.repository.AsociationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Service
@RequiredArgsConstructor
public class FindAsociationService {

	private final AsociationRepository asociationRepository;
	private final AsociationConverter asociationConverter;

	public AsociationResponse findById(Long id) {
		Asociation asociation = findAsociationOrThrow(id);
		return asociationConverter.fromAsociationToAsociationResponse(asociation);
	}

	private Asociation findAsociationOrThrow(Long id) {
		return asociationRepository
				.findById(id)
				.orElseThrow(AsociationException::asociationNotFound);
	}

}
