package com.app.flat.manager.converter;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@RequiredArgsConstructor
public class BaseConverter {

	private final ModelMapper modelMapper;

	public <T> T map(Object object, Class<T> target) {
		return modelMapper.map(object, target);
	}

}
