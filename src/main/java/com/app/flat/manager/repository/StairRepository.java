package com.app.flat.manager.repository;

import java.util.List;

import com.app.flat.manager.model.stair.Stair;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Flat Manager
 * Created by catalin on 2/9/2020
 */
public interface StairRepository extends JpaRepository<Stair, Long> {
	List<Stair> findAllByBuildingId(Long buildingId);
}
