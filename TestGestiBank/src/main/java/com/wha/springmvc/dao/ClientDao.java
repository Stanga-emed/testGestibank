package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Client;

public interface ClientDao {
	
	
Client findById(int id);
	
	Client findByName(String name);
	
	void save(Client client);
	
	void deleteClientById(int id);
	
	Collection<Client> findAllClients();
	
	void deleteAllClients();

	
	
}
