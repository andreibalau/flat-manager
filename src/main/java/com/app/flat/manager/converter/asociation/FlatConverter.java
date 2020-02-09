package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.CreateFlatRequest;
import com.app.flat.manager.controller.payload.asociation.FlatResponse;
import com.app.flat.manager.controller.payload.asociation.PreviewFlatResponse;
import com.app.flat.manager.converter.BaseConverter;
import com.app.flat.manager.model.asociation.Flat;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Component
public class FlatConverter extends BaseConverter {

	public FlatConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public FlatResponse fromFlatToFlatResponse(Flat flat) {
		return map(flat, FlatResponse.class);
	}

	public PreviewFlatResponse fromFlatToPreviewFlatResponse(Flat flat) {
		return map(flat, PreviewFlatResponse.class);
	}

	public Flat fromCreateFlatRequestToFlat(CreateFlatRequest request) {
		return map(request, Flat.class);
	}

}
