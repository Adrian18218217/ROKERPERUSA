package com.rokerperusa.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="direccion")
public class Direccion {

	@Id
	@Column(name="id_direccion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_direccion;
	
	@Column(name="departamento")
	private String departamento;
	@Column(name="distrito")
	private String distrito;
	@Column(name="latitud")
	private double latitud;
	@Column(name="longitud")
	private double longitud;
	@Column(name="direccion")
	private String direccion;
	@Column(name="referencia")
	String referencia;
	
	@OneToMany(mappedBy="direccion")
	private Set<Cliente> clientes;

	public Direccion(String departamento, String distrito, double latitud, double longitud, String direccion,
			String referencia) {
		this.departamento = departamento;
		this.distrito = distrito;
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccion = direccion;
		this.referencia = referencia;
	}
	
	
}
