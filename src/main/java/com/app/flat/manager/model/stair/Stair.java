package com.app.flat.manager.model.stair;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

import com.app.flat.manager.model.building.Building;
import com.app.flat.manager.model.flat.Flat;
import com.app.flat.manager.model.user.User;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 1/20/2020
 */
@Getter
@Setter
@Entity
@Table(name = "stairs")
public class Stair {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@OneToMany(mappedBy = "stair", cascade = CascadeType.ALL)
	private Set<Flat> flats = new HashSet<>();
	@NotNull
	@ManyToOne
	@JoinColumn(name = "building_id", nullable = false)
	private Building building;
	@ManyToOne
	@JoinColumn(name = "administrator_id")
	private User administrator;

}
