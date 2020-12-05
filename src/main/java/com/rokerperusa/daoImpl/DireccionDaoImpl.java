package com.rokerperusa.daoImpl;

import java.util.List;

import com.rokerperusa.dao.DireccionDao;
import com.rokerperusa.model.Cliente;
import com.rokerperusa.model.Direccion;

public class DireccionDaoImpl extends AbstractSession implements DireccionDao{

	@Override
	public boolean existeDireccion(int id_direccion) {
		if (getSession().get(Direccion.class, id_direccion)!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void saveDireccion(Direccion direccion) {
		getSession().persist(direccion);
	}

	@Override
	public void deleteDireccionById(int id_direccion) {
		Direccion direccion=findById(id_direccion);
		if(direccion!=null) {
			getSession().delete(direccion);
		}
	}

	@Override
	public void updateDireccion(Direccion direccion) {
		getSession().saveOrUpdate(direccion);
	}

	@Override
	public List<Direccion> listarDirecciones() {
		return getSession().createQuery("from Direccion").list();
	}
	

	@Override
	public Direccion findById(int id_direccion) {
		return getSession().get(Direccion.class, id_direccion);
	}



}
