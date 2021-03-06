package com.app.flat.manager.model.asociation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

import com.app.flat.manager.model.address.City;
import com.app.flat.manager.model.building.Building;
import com.app.flat.manager.model.user.User;
import com.app.flat.manager.model.utility.Utility;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@Getter
@Setter
@Entity
@Table(name = "asociations")
public class Asociation {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false, name = "president_id")
	private User president;
	@NotBlank
	@Column(nullable = false, name = "address")
	private String address;
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	@NotNull
	@OneToMany(mappedBy = "asociation")
	private Set<@NotNull Building> buildings = new HashSet<>();
	@NotNull
	@ManyToMany
	@JoinTable(
			name = "asociations_utilities",
			joinColumns = @JoinColumn(name = "utility_id", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "asociation_id", nullable = false)
	)
	private Set<@NotNull Utility> utilities = new HashSet<>();

}
