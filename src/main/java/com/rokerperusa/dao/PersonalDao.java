package com.rokerperusa.dao;

import java.util.List;

import com.rokerperusa.model.Personal;

public interface PersonalDao {

void savePersonal(Personal personal);
	
	void deletePersonalById(int id_personal);
	
	void updatePersonal(Personal personal);
	
	List<Personal> listarPersonal();
	
	Personal findById(int id_personal);
	
	boolean existePersonal(int id_personal);
}
