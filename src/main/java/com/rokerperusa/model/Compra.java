package com.rokerperusa.model;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Compra {

	private int id_compra;
	private double descuento;
	private String fecha_compra;
	private Proveedor id_proveedor;
	private double igv;
	private double subtotal;
	private double total;
	private Set<DetalleCompra> detalle_compra;
	
	public Compra(double descuento, String fecha_compra, Proveedor id_proveedor, double igv, double subtotal, double total) {
		this.descuento = descuento;
		this.fecha_compra = fecha_compra;
		this.id_proveedor = id_proveedor;
		this.igv = igv;
		this.subtotal = subtotal;
		this.total = total;
	}
	
	
	
}
