package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.PreviewStairResponse;
import com.app.flat.manager.controller.payload.asociation.StairResponse;
import com.app.flat.manager.model.asociation.Stair;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Component
@RequiredArgsConstructor
public class StairConverter {

	private final ModelMapper modelMapper;

	public StairResponse fromStairToStairResponse(Stair stair) {
		return modelMapper.map(stair, StairResponse.class);
	}

	public PreviewStairResponse fromStairToPreviewStairResponse(Stair stair) {
		return modelMapper.map(stair, PreviewStairResponse.class);
	}

}
