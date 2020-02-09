package com.app.flat.manager.model.flat;

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

import com.app.flat.manager.model.stair.Stair;
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
@Table(name = "flats")
public class Flat {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@Column(nullable = false, name = "number")
	private Integer number;
	@NotNull
	@Column(nullable = false, name = "number_of_persons")
	private Integer numberOfPersons;
	@NotNull
	@Column(nullable = false, name = "total_surface")
	private Double totalSurface;
	@NotNull
	@Column(nullable = false, name = "used_surface")
	private Double usedSurface;
	@NotNull
	@OneToMany(mappedBy = "flat", cascade = CascadeType.ALL)
	private Set<User> users = new HashSet<>();
	@NotNull
	@OneToMany(mappedBy = "flat", cascade = CascadeType.ALL)
	private Set<Contor> contors = new HashSet<>();
	@NotNull
	@ManyToOne
	@JoinColumn(name = "stair_id", nullable = false)
	private Stair stair;

}
