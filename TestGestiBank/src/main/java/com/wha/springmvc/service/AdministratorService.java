package com.wha.springmvc.service;

import java.util.Collection;

import com.wha.springmvc.model.Administrator;

public interface AdministratorService {
	
	
	Administrator findByName(String name);
	
	Administrator findById(int id);

	void saveAdministrator(Administrator admin);

	Collection<Administrator> findAllAdministrators();

	public boolean isUsExist(Administrator admin);

	void deleteAdministratorById(int id);

	

}
