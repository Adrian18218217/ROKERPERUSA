package com.rokerperusa.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@Column(name="id_pedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_pedido;
	
	@Column(name="fecha_venta")
	private String fecha_venta;
	
	@Column(name="fecha_pedido")
	private String fecha_pedido;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_personal")
	private Personal personal;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_delivery")
	private Delivery delivery;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="descuento")
	private double descuento;
	
	@Column(name="subtotal")
	private double subtotal;
	
	@Column(name="igv")
	private double igv;
	
	@Column(name="total")
	private double total;
	
	@Column(name="metodo_pago")
	private String metodo_pago;
	
	@Column(name="costo_direccion")
	private double costo_direccion;
	
	public Pedido() {
		
	}

	public Pedido(String fecha_venta, String fecha_pedido, Cliente cliente, Personal personal, Delivery delivery,
			String estado, double descuento, double subtotal, double igv, double total, String metodo_pago,
			double costo_direccion) {
		this.fecha_venta = fecha_venta;
		this.fecha_pedido = fecha_pedido;
		this.cliente = cliente;
		this.personal = personal;
		this.delivery = delivery;
		this.estado = estado;
		this.descuento = descuento;
		this.subtotal = subtotal;
		this.igv = igv;
		this.total = total;
		this.metodo_pago = metodo_pago;
		this.costo_direccion = costo_direccion;
	}
	
	
	
}
