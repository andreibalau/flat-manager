package com.app.flat.manager.model.utility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

import com.app.flat.manager.model.asociation.Asociation;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@Getter
@Setter
@Entity
@Table(name = "utilities")
public class Utility {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false, name = "uom")
	private Uom uom;
	@NotNull
	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false, name = "utility_type")
	private UtilityType type;
	@NotNull
	@Column(nullable = false, name = "price")
	private Double price;
	@NotNull
	@ManyToMany(mappedBy = "utilities")
	private Set<Asociation> asociations = new HashSet<>();

}
