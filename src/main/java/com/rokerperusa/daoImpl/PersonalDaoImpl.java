package com.rokerperusa.daoImpl;

import java.util.List;

import com.rokerperusa.dao.PersonalDao;
import com.rokerperusa.model.Personal;

public class PersonalDaoImpl extends AbstractSession implements PersonalDao {

	@Override
	public void savePersonal(Personal personal) {
		getSession().persist(personal);
		
	}

	@Override
	public void deletePersonalById(int id_personal) {
		Personal personal=findById(id_personal);
		if(personal!=null) {
			getSession().delete(personal);
		}
	}

	@Override
	public void updatePersonal(Personal personal) {
		getSession().update(personal);
	}

	@Override
	public List<Personal> listarPersonal() {
		return getSession().createQuery("from Personal").list();
	}

	@Override
	public Personal findById(int id_personal) {
		return getSession().get(Personal.class, id_personal);
	}

	@Override
	public boolean existePersonal(int id_personal) {
		if (getSession().get(Personal.class, id_personal)!=null) {
			return true;
		}else {
			return false;
		}
	}

	
}
