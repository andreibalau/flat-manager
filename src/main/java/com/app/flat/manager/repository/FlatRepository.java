package com.app.flat.manager.repository;

import java.util.List;

import com.app.flat.manager.model.flat.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
public interface FlatRepository extends JpaRepository<Flat, Long> {
	List<Flat> findAllByStairId(Long stairId);
}
