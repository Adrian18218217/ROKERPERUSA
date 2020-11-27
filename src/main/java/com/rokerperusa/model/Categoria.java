package com.rokerperusa.model;

import java.util.Set;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
public class Categoria {

	private int id_categoria;
	private String denominacion;
	private Set<Producto> productos;
	
	public Categoria(String denominacion) {
		this.denominacion=denominacion;
	}
	
	
	
	
}
