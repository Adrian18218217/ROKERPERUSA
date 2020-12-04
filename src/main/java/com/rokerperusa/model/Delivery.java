package com.rokerperusa.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="delivery")
public class Delivery {

	@Id
	@Column(name="id_delivery")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_delivery;
	@Column(name="hora_inicio")
	private  String hora_inicio;
	@Column(name="hora_fin")
	private String hora_fin;
	@Column(name="estado")
	private String estado;
	@Column(name="dia")
	private String dia;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_personal")
	private Personal personal;
	
	public Delivery() {
		
	}
	
	public Delivery(String hora_inicio, String hora_fin, String estado, String dia) {
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.estado = estado;
		this.dia = dia;
	}
	
	

	
	
	
}
