package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.asociation.AsociationResponse;
import com.app.flat.manager.controller.payload.asociation.CreateAsociationRequest;
import com.app.flat.manager.converter.BaseConverter;
import com.app.flat.manager.model.asociation.Asociation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
public class AsociationConverter extends BaseConverter {

	public AsociationConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public Asociation fromCreateAsociationRequestToAsociation(CreateAsociationRequest request) {
		return map(request, Asociation.class);
	}

	public AsociationResponse fromAsociationToAsociationResponse(Asociation asociation) {
		return map(asociation,AsociationResponse.class);
	}

}
