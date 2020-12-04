package com.rokerperusa.daoImpl;

import java.util.List;

import com.rokerperusa.dao.ClienteDao;
import com.rokerperusa.model.Cliente;

public class ClienteDaoImpl extends AbstractSession implements ClienteDao {

	@Override
	public void saveClient(Cliente cliente) {
		
	}

	@Override
	public void deleteClientById(int id_teacher) {
		
	}

	@Override
	public void updateClient(Cliente cliente) {
		
	}

	@Override
	public List<Cliente> listarClientes() {
		return null;
	}

	@Override
	public Cliente findById(int id_teacher) {
		return null;
	}

	@Override
	public boolean existeCliente(int id_teacher) {
		return false;
	}

}
