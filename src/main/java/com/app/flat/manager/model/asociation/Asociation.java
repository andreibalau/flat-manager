package com.app.flat.manager.model.asociation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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

import com.app.flat.manager.model.user.User;
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
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false, name = "president_id")
	private User president;
	@NotNull
	@OneToMany(mappedBy = "asociation")
	private Set<Building> buildings = new HashSet<>();
	@NotNull
	@ManyToMany
	@JoinTable(
			name = "asociations_services",
			joinColumns = @JoinColumn(name = "service_id", nullable = false),
			inverseJoinColumns = @JoinColumn(name = "asociation_id", nullable = false)
	)
	private Set<Service> services = new HashSet<>();

}
