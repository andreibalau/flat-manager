package com.app.flat.manager.model.asociation;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

import com.app.flat.manager.model.address.City;
import com.app.flat.manager.model.address.Country;
import com.app.flat.manager.model.address.County;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 1/20/2020
 */
@Getter
@Setter
@Entity
@Table(name = "buildings")
public class Building {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "asociation_id", nullable = false)
	private Asociation asociation;
	@NotNull
	@OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
	private Set<Stair> stairs = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	@ManyToOne
	@JoinColumn(name = "county_id")
	private County county;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

}
