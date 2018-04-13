package com.wha.springmvc.service;

import java.util.Collection;

import com.wha.springmvc.model.Client;

public interface ClientService {
	
	
Client findById(long id);
	
Client findByName(String name);
	
	void saveClient(Client client);
	
	void updateClient(Client client);
	
	void deleteClientById(long id);

	Collection<Client> findAllClients(); 
	
	void deleteAllClients();
	
	public boolean isUserExist(Client client);
	
	

}
