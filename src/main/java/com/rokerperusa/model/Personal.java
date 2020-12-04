package com.rokerperusa.model;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="personal")
public class Personal {
	
	@Id
	@Column(name="id_personal")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_personal;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;
	@Column(name="password")
	private String password;
	
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="id_privilegio")
	private Privilegio privilegio;
	
	@Column(name="icono")
	private String icono;
	@Column(name="fecha_ingreso")
	private String fecha_ingreso;
	
	@Column(name="genero")
	private String genero;
	
	@OneToMany(mappedBy="personal")
	private Set<Delivery> deliverys;
	
	@OneToMany(mappedBy="personal")
	private Set<Pedido> pedidos;
	
	public Personal() {
		
	}

	public Personal(String nombres, String apellidos, String telefono, String correo, String password,
			Privilegio privilegio, String icono, String fecha_ingreso, String genero) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.privilegio = privilegio;
		this.icono = icono;
		this.fecha_ingreso = fecha_ingreso;
		this.genero = genero;
	}
	
	
	
}
