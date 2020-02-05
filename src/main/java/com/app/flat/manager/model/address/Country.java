package com.app.flat.manager.model.address;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Flat Manager
 * Created by catalin on 1/20/2020
 */
@Getter
@Setter
@Entity
@Table(name = "countries")
public class Country {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false)
	private String name;
	@NotNull
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private Set<County> counties = new HashSet<>();

}
