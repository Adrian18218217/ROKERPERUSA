package com.rokerperusa.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="servicio")
public class Servicio {

	@Id
	@Column(name="id_servicio")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_servicio;
	
	@Column(name="costo")
	private double costo;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="disponibilidad")
	private boolean disponibilidad;
	
	@Column(name="denominacion")
	private String denominacion;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="icono")
	private String icono;
	
	
	public Servicio() {
		
	}


	public Servicio(double costo, double precio, boolean disponibilidad, String denominacion, String descripcion,
			String icono) {
		this.costo = costo;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		this.icono = icono;
	}
	
	
	
}
