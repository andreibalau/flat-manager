package com.app.flat.manager.model.address;

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

import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 1/20/2020
 */
@Getter
@Setter
@Entity
@Table(name = "counties")
public class County {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false)
	private String name;
	@NotBlank
	@Column(nullable = false, unique = true)
	private String abbrev;
	@NotNull
	@OneToMany(mappedBy = "county")
	private Set<City> cities = new HashSet<>();
	@NotNull
	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;

}
