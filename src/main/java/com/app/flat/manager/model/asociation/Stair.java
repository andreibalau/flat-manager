package com.app.flat.manager.model.asociation;

import com.app.flat.manager.model.user.User;
import lombok.Getter;
import lombok.Setter;

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
	@GeneratedValue
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
