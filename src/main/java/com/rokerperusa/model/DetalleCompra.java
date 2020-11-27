package com.rokerperusa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DetalleCompra {

	private int id_detalle_compra;
	private int cantidad;
	private Compra id_compra;
	private Producto id_producto;
	
	public DetalleCompra(int cantidad, int id_compra, int id_producto) {
		super();
		this.cantidad = cantidad;
		this.id_compra = id_compra;
		this.id_producto = id_producto;
	}
	
	
	
}
