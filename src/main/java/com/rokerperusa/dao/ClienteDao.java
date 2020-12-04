package com.rokerperusa.dao;

import java.util.List;

import com.rokerperusa.model.*;

public interface ClienteDao {

	void saveClient(Cliente cliente);
	
	void deleteClientById(int id_teacher);
	
	void updateClient(Cliente cliente);
	
	List<Cliente> listarClientes();
	
	Cliente findById(int id_teacher);
	
	boolean existeCliente(int id_teacher);
	
}
