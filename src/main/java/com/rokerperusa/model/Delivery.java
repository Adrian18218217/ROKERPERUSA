package com.rokerperusa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Delivery {

	private int id_delivery;
	private  String hora_inicio;
	private String hora_fin;
	private String estado;
	private String dia;
	private Personal documento;
	
	public Delivery(String hora_inicio, String hora_fin, String estado, String dia, Personal documento) {
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.estado = estado;
		this.dia = dia;
		this.documento = documento;
	}
	
	
	
	
}
