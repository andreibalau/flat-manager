package com.app.flat.manager.converter.asociation;

import com.app.flat.manager.controller.payload.asociation.BuildingResponse;
import com.app.flat.manager.controller.payload.asociation.CreateBuildingRequest;
import com.app.flat.manager.controller.payload.asociation.PreviewBuildingResponse;
import com.app.flat.manager.converter.BaseConverter;
import com.app.flat.manager.model.asociation.Building;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
@Component
public class BuildingConverter extends BaseConverter {

	public BuildingConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public BuildingResponse fromBuildingToBuildingResponse(Building building) {
		return map(building, BuildingResponse.class);
	}

	public PreviewBuildingResponse fromBuildingToPreviewBuildingResponse(Building building) {
		return map(building, PreviewBuildingResponse.class);
	}

	public Building fromCreateBuildingRequestToBuilding(CreateBuildingRequest request) {
		return map(request, Building.class);
	}


}
