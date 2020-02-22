package com.app.flat.manager.repository;

import com.app.flat.manager.model.address.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
public interface CityRepository extends JpaRepository<City, Long> {
}
