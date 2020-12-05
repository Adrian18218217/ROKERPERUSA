package com.rokerperusa.dao;

import java.util.List;

import com.rokerperusa.model.Privilegio;

public interface PrivilegioDao {

	void savePrivilegio(Privilegio privilegio);
	
	void deletePrivilegioById(int id_privilegio);
	
	void updatePrivilegio(Privilegio privilegio);
	
	List<Privilegio> listarPrivilegios();
	
	Privilegio findById(int id_privilegio);
	
	boolean existePrivilegio(int id_privilegio);
	
	
}
