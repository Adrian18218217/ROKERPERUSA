package com.rokerperusa.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cliente;
	@Column(name="tipo_documento")
	private String tipo_documento;
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
	@Column(name="prioridad")
	private int prioridad;
	
	@ManyToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name="id_direccion")
	private Direccion direccion;
	
	
	
	@Column(name="icono")
	private String icono;
	@Column(name="genero")
	private String genero;
	
	@OneToMany(mappedBy="direccion")
	private Set<Pedido> pedidos;
	
	
	public Cliente() {
		
	}


	public Cliente(int id_cliente, String tipo_documento, String nombres, String apellidos, String telefono,
			String correo, String password, int prioridad, String genero) {
		this.id_cliente = id_cliente;
		this.tipo_documento = tipo_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.prioridad = prioridad;
		this.genero = genero;
	}
	
	


	
	
	
	
	
}
