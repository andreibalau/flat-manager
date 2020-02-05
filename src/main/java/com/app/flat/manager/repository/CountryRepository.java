package com.app.flat.manager.repository;

import com.app.flat.manager.model.address.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * flat-manager
 * Created by catalin on 05.02.2020
 */
public interface CountryRepository extends JpaRepository<Country, Long> { }
