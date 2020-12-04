package com.rokerperusa.model;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="privilegio")
public class Privilegio {

	@Id
	@Column(name="id_privilegio")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_privilegio;
	@Column(name="cargo")
	private String cargo;
	@Column(name="permisos")
	private String permisos;
	
	@OneToMany(mappedBy="privilegio")
	private Set<Personal> personales;
	
	public Privilegio() {
		
	}

	public Privilegio(String cargo, String permisos) {
		super();
		this.cargo = cargo;
		this.permisos = permisos;
	}
	
	
	
}
