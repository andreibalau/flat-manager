package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.BuildingResponse;
import com.app.flat.manager.controller.payload.asociation.CreateBuildingRequest;
import com.app.flat.manager.controller.payload.asociation.PreviewBuildingResponse;
import com.app.flat.manager.model.asociation.Building;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
@RequiredArgsConstructor
public class BuildingConverter {

	private final ModelMapper modelMapper;

	public BuildingResponse fromBuildingToBuildingResponse(Building building) {
		return modelMapper.map(building, BuildingResponse.class);
	}

	public PreviewBuildingResponse fromBuildingToPreviewBuildingResponse(Building building) {
		return modelMapper.map(building, PreviewBuildingResponse.class);
	}

	public Building fromCreateBuildingRequestToBuilding(CreateBuildingRequest request) {
		return modelMapper.map(request, Building.class);
	}


}
