package com.rokerperusa.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="detalle_pedido")
public class DetallePedido {

	@Id
	@Column(name="id_detalle_pedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_detalle_pedido;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pedido")
	private Pedido pedido;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_producto")
	private Producto producto;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_servicio")
	private Servicio servicio;
	
	@Column(name="cantidad")
	private int cantidad;
	
	public DetallePedido() {
		
	}
}
