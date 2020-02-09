package com.app.flat.manager.service.flat;

import java.util.List;
import java.util.stream.Collectors;

import com.app.flat.manager.controller.payload.flat.FlatResponse;
import com.app.flat.manager.controller.payload.flat.PreviewFlatResponse;
import com.app.flat.manager.converter.FlatConverter;
import com.app.flat.manager.exception.AsociationException;
import com.app.flat.manager.model.flat.Flat;
import com.app.flat.manager.repository.FlatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class FindFlatService {

	private final FlatRepository flatRepository;
	private final FlatConverter flatConverter;

	public FlatResponse findById(Long id) {
		Flat flat = findFlatOrThrow(id);
		return flatConverter.fromFlatToFlatResponse(flat);
	}

	public List<PreviewFlatResponse> findAllByStair(Long stairId) {
		return flatRepository
				.findAllByStairId(stairId)
				.stream()
				.map(flatConverter::fromFlatToPreviewFlatResponse)
				.collect(Collectors.toList());
	}

	public Flat findFlatOrThrow(Long id) {
		return flatRepository
				.findById(id)
				.orElseThrow(AsociationException::flatNotFound);
	}

}
