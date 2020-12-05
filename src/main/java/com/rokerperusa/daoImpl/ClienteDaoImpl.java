package com.rokerperusa.daoImpl;
import java.util.List;

import com.rokerperusa.dao.ClienteDao;
import com.rokerperusa.model.Cliente;
import com.rokerperusa.model.Direccion;

public class ClienteDaoImpl extends AbstractSession implements ClienteDao {

	
	@Override
	public void saveClient(Cliente cliente) {
		getSession().persist(cliente);
	}

	@Override
	public void deleteClientById(int id_cliente) {
		Cliente cliente=findById(id_cliente);
		if (cliente!=null) {
			getSession().delete(cliente);
		}
	}

	@Override
	public void updateClient(Cliente cliente) {
		getSession().update(cliente);
	}

	@Override
	public List<Cliente> listarClientes() {
		return getSession().createQuery("from Cliente").list();
	}

	@Override
	public Cliente findById(int id_cliente) {
		return getSession().get(Cliente.class, id_cliente);
	}

	@Override
	public boolean existeCliente(int id_cliente) {
		if (getSession().get(Cliente.class, id_cliente)!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Cliente> findByIdDireccion(int id_direccion) {
		
		return getSession().createQuery("from Cliente c join c.direccion d where d.id_direccion = :id_direccion")
				.setParameter("id_direccion",id_direccion).list();
	}
	
	

}
