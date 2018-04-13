package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Administrator;

public interface AdminitratorDao {
	
	Administrator findById(int id);

	Administrator findByName(String name);

	void save(Administrator admin);
	
	void deleteAdministratorById(int id);


	Collection<Administrator> findAlldAmins();

	

	

	

}
