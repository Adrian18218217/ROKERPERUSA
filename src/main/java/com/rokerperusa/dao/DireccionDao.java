package com.rokerperusa.dao;

import java.util.List;

import com.rokerperusa.model.Direccion;


public interface DireccionDao {
	
	boolean existeDireccion(int id_direccion);
	
	void saveDireccion(Direccion direccion);
	
	void deleteDireccionById(int id_direccion);
	
	void updateDireccion(Direccion direccion);
	
	List<Direccion> listarDirecciones();
	
	Direccion findById(int id_direccion);
	
}
