package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.AsociationResponse;
import com.app.flat.manager.controller.payload.asociation.CreateAsociationRequest;
import com.app.flat.manager.model.asociation.Asociation;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
@RequiredArgsConstructor
public class AsociationConverter {

	private final ModelMapper modelMapper;

	public Asociation fromCreateAsociationRequestToAsociation(CreateAsociationRequest request) {
		return modelMapper.map(request, Asociation.class);
	}

	public AsociationResponse fromAsociationToAsociationResponse(Asociation asociation) {
		return modelMapper.map(asociation,AsociationResponse.class);
	}

}
