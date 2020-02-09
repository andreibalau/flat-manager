package com.app.flat.manager.service.asociation;

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
public class DeleteStairService {

	private final StairRepository stairRepository;
	private final FindStairService findStairService;

	public void delete(Long id) {
		Stair stair = findStairService.findStairOrThrow(id);
		stairRepository.delete(stair);
	}

}
