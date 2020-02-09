package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.PreviewStairResponse;
import com.app.flat.manager.controller.payload.asociation.StairResponse;
import com.app.flat.manager.converter.BaseConverter;
import com.app.flat.manager.model.asociation.Stair;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Component
public class StairConverter extends BaseConverter {

	public StairConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public StairResponse fromStairToStairResponse(Stair stair) {
		return map(stair, StairResponse.class);
	}

	public PreviewStairResponse fromStairToPreviewStairResponse(Stair stair) {
		return map(stair, PreviewStairResponse.class);
	}

}
