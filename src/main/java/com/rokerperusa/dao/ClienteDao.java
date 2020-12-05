package com.rokerperusa.dao;

import java.util.List;

import com.rokerperusa.model.*;

public interface ClienteDao {

	void saveClient(Cliente cliente);
	
	void deleteClientById(int id_cliente);
	
	void updateClient(Cliente cliente);
	
	List<Cliente> listarClientes();
	
	Cliente findById(int id_cliente);
	
	boolean existeCliente(int id_cliente);
	
	List<Cliente> findByIdDireccion(int id_direccion);
	
	
}
