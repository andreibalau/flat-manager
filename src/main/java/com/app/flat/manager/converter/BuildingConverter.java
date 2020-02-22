package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.building.BuildingResponse;
import com.app.flat.manager.controller.payload.building.CreateBuildingRequest;
import com.app.flat.manager.controller.payload.building.PreviewBuildingResponse;
import com.app.flat.manager.model.building.Building;
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
