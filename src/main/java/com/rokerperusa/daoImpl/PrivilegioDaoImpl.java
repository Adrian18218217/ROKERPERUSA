package com.rokerperusa.daoImpl;

import java.util.List;

import com.rokerperusa.dao.PrivilegioDao;
import com.rokerperusa.model.Cliente;
import com.rokerperusa.model.Privilegio;

public class PrivilegioDaoImpl extends AbstractSession implements PrivilegioDao {

	@Override
	public void savePrivilegio(Privilegio privilegio) {
		getSession().persist(privilegio);
	}
	
	@Override
	public void deletePrivilegioById(int id_privilegio) {
		Privilegio privilegio=findById(id_privilegio);
		if (privilegio!=null) {
			getSession().delete(privilegio);
		}
	}

	@Override
	public void updatePrivilegio(Privilegio privilegio) {
		getSession().update(privilegio);
	}

	@Override
	public List<Privilegio> listarPrivilegios() {
		return getSession().createQuery("from Privilegio").list();
	}

	@Override
	public Privilegio findById(int id_privilegio) {
		return getSession().get(Privilegio.class, id_privilegio);
	}

	@Override
	public boolean existePrivilegio(int id_privilegio) {
		if(getSession().get(Privilegio.class,id_privilegio)!=null) {
			return true;
		}else {
			return false;
		}
	}

}
