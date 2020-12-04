package com.rokerperusa.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="producto")

public class Producto {

	@Id
	@Column(name="id_producto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_producto;
	
	@Column(name="costo")
	private double costo;
	
	@Column(name="precio")
	private double precio;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="denominacion")
	private String denominacion;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha_compra")
	private String fecha_compra;
	
	@Column(name="icono")
	private String icono;
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id_producto")
	private Set<DetalleCompra> detalleCompra;
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id_producto")
	private Set<DetallePedido> detallePedido;
	
	public Producto() {
		
	}

	public Producto(double costo, double precio, int stock, String denominacion, String descripcion,
			String fecha_compra) {
		this.costo = costo;
		this.precio = precio;
		this.stock = stock;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		this.fecha_compra = fecha_compra;
	}

	public Producto(double costo, double precio, Categoria categoria, int stock, String denominacion,
			String descripcion, String fecha_compra, String icono) {
		this.costo = costo;
		this.precio = precio;
		this.categoria = categoria;
		this.stock = stock;
		this.denominacion = denominacion;
		this.descripcion = descripcion;
		this.fecha_compra = fecha_compra;
		this.icono = icono;
	}
	
	
	
}
