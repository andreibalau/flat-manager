package com.app.flat.manager.model.flat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import com.app.flat.manager.model.utility.UtilityType;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 2/2/2020
 */
@Getter
@Setter
@Entity
@Table(name = "contors")
public class Contor {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "name")
	private String name;
	@NotNull
	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false, name = "contor_type")
	private UtilityType type;
	@NotBlank
	@Column(nullable = false, name = "serial", unique = true)
	private String serial;
	@NotNull
	@Column(nullable = false, name = "initial_index")
	private BigDecimal initialIndex;
	@NotNull
	@Column(nullable = false, name = "current_index")
	private BigDecimal currentIndex;
	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false, name = "flat_id")
	private Flat flat;

}
