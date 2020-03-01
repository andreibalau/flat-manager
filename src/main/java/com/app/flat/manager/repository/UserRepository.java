package com.app.flat.manager.repository;

import java.util.Optional;

import com.app.flat.manager.model.asociation.Asociation;
import com.app.flat.manager.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Flat Manager
 * Created by catalin on 05.02.2020
 */
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);

	@Query(
			"select a from Asociation a " +
					"inner join Building b on a.id = b.asociation.id " +
					"inner join Stair s on s.building.id = b.id " +
					"inner join Flat f on f.stair.id = s.id " +
					"where f.id = :flatId"
	)
	Optional<Asociation> findAsociationByUserFlat(Long flatId);
}
