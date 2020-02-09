package com.app.flat.manager.repository;

import java.util.List;

import com.app.flat.manager.model.building.Building;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Flat Manager
 * Created by catalin on 2/7/2020
 */
public interface BuildingRepository extends JpaRepository<Building, Long> {
	List<Building> findAllByAsociationId(Long asociationId);
}
