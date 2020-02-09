package com.app.flat.manager.service.asociation;

import java.util.List;
import java.util.stream.Collectors;

import com.app.flat.manager.controller.payload.asociation.PreviewStairResponse;
import com.app.flat.manager.controller.payload.asociation.StairResponse;
import com.app.flat.manager.converter.asociation.StairConverter;
import com.app.flat.manager.exception.AsociationException;
import com.app.flat.manager.model.asociation.Stair;
import com.app.flat.manager.repository.StairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
@Service
@RequiredArgsConstructor
public class FindStairService {

	private final StairRepository stairRepository;
	private final StairConverter stairConverter;

	public StairResponse findById(Long id) {
		Stair stair = findStairOrThrow(id);
		return stairConverter.fromStairToStairResponse(stair);
	}

	public List<PreviewStairResponse> findAllByBuilding(Long buildingId) {
		return stairRepository
				.findAllByBuildingId(buildingId)
				.stream()
				.map(stairConverter::fromStairToPreviewStairResponse)
				.collect(Collectors.toList());
	}

	public Stair findStairOrThrow(Long id) {
		return stairRepository
				.findById(id)
				.orElseThrow(AsociationException::stairNotFound);
	}

}
