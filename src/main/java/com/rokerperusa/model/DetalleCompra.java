package com.rokerperusa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="detalle_compra")
public class DetalleCompra {

	@Id
	@Column(name="id_detalle_compra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_detalle_compra;
	
	@Column(name="cantidad")
	private int cantidad;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_producto")
	//@JsonIgnore
	private Producto producto;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_compra")
	private Compra compra;
	
	public DetalleCompra() {
		
	}
	
}
