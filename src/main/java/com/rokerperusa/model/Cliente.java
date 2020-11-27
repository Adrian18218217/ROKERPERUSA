package com.rokerperusa.model;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
public class Cliente {

	private int documento;
	private String tipo_documento;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String correo;
	private String password;
	private int prioridad;
	private Direccion id_direccion;
	private String icono;
	private String genero;
	private Set<Pedido> pedidos;
	
	
	public Cliente(String tipo_documento, String nombres, String apellidos, String telefono, String correo,
			String password, String genero) {
		this.tipo_documento = tipo_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.genero = genero;
	}


	
	
	
	
	
}
