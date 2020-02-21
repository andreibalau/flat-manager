package com.app.flat.manager.model.user;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

import com.app.flat.manager.model.flat.Flat;
import lombok.Getter;
import lombok.Setter;

/**
 * Flat Manager
 * Created by catalin on 1/20/2020
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

	@Id
	@NotNull
	@GeneratedValue
	private Long id;
	@NotBlank
	@Column(nullable = false, name = "first_name")
	private String firstName;
	@NotBlank
	@Column(nullable = false, name = "last_name")
	private String lastName;
	@NotNull
	@Email
	@Column(nullable = false, unique = true, name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@NotBlank
	@Column(nullable = false, name = "password")
	private String password;
	@NotNull
	@ElementCollection(targetClass = Role.class)
	@CollectionTable(name = "user_role",
			joinColumns = @JoinColumn(name = "user_id"))
	@Enumerated(EnumType.STRING)
	private Set<Role> roles;
	@NotNull
	@ManyToOne
	@JoinColumn(nullable = false, name = "flat_id")
	private Flat flat;
	@NotNull
	@Column(nullable = false, name = "is_paid")
	private Boolean paid;

}
