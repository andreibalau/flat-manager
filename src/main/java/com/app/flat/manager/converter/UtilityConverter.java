package com.app.flat.manager.converter;

import com.app.flat.manager.controller.payload.utility.CreateUtilityRequest;
import com.app.flat.manager.controller.payload.utility.PreviewUtilityResponse;
import com.app.flat.manager.controller.payload.utility.UtilityResponse;
import com.app.flat.manager.model.utility.Utility;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Component
public class UtilityConverter extends BaseConverter {

	public UtilityConverter(ModelMapper modelMapper) {
		super(modelMapper);
	}

	public UtilityResponse fromUtilityToUtilityResponse(Utility utility) {
		return map(utility, UtilityResponse.class);
	}

	public PreviewUtilityResponse fromUtilityToPreviewUtilityResponse(Utility utility) {
		return map(utility, PreviewUtilityResponse.class);
	}

	public Utility fromCreateUtilityRequestToUtility(CreateUtilityRequest request) {
		return map(request, Utility.class);
	}
}
