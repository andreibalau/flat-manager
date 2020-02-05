package com.app.flat.manager.controller.api;

import com.app.flat.manager.controller.payload.EntityCreatedResponse;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@RequestMapping("/api/v1/asociations")
public interface AsociationApi {

	EntityCreatedResponse create();
	void delete();
	void findById();
	void update();

}
