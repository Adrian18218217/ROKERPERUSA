package com.rokerperusa.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@Column(name="id_categoria")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_categoria;
	
	@Column(name="denominacion")
	private String denominacion;
	
	
	@OneToMany(mappedBy="producto")
	@JoinColumn(name="id_categoria")
	private Set<Producto> productos;
	
	public Categoria(String denominacion) {
		this.denominacion=denominacion;
	}
	
	public Categoria() {
		
	}

}
