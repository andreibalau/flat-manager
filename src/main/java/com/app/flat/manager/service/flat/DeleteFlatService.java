package com.app.flat.manager.service.flat;

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
public class DeleteFlatService {

	private final FlatRepository flatRepository;
	private final FindFlatService findFlatService;

	public void delete(Long id) {
		Flat flat = findFlatService.findFlatOrThrow(id);
		flatRepository.delete(flat);
	}

}
