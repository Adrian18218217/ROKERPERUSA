package com.rokerperusa.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="proveedor")
public class Proveedor {

	@Id
	@Column(name="id_proveedor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_proveedor;
	
	@Column(name="ruc")
	private String ruc;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="calificacion")
	private int calificacion;
	
	@Column(name="icono")
	private String icono;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private Set<Compra> compra;
	
	public Proveedor() {
		
	}

	public Proveedor(String ruc, String nombre, String telefono, String correo, int calificacion, String icono,
			Set<Compra> compra) {
		this.ruc = ruc;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.calificacion = calificacion;
		this.icono = icono;
		this.compra = compra;
	}
	
	
}
