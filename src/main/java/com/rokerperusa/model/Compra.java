package com.rokerperusa.model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
@Table(name="compra")
public class Compra {

	@Id
	@Column(name="id_compra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_compra;
	
	@Column(name="descuento")
	private double descuento;
	
	@Column(name="fecha_compra")
	private String fecha_compra;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="id_compra")
	private Set<DetalleCompra> detalleCompra;
	
	@Column(name="igv")
	private double igv;
	
	@Column(name="subtotal")
	private double subtotal;
	
	@Column(name="total")
	private double total;
	
	@ManyToOne(optional=true, fetch=FetchType.EAGER)
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;
	
	public Compra() {
		
	}

	public Compra(double descuento, String fecha_compra, Set<DetalleCompra> detalleCompra, double igv,
			Proveedor proveedor) {
		this.descuento = descuento;
		this.fecha_compra = fecha_compra;
		this.detalleCompra = detalleCompra;
		this.igv = igv;
		this.proveedor = proveedor;
	}
	
	
	
}
