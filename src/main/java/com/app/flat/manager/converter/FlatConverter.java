package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.flat.CreateFlatRequest;
import com.app.flat.manager.controller.payload.flat.FlatResponse;
import com.app.flat.manager.controller.payload.flat.PreviewFlatResponse;
import com.app.flat.manager.model.flat.Flat;
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
