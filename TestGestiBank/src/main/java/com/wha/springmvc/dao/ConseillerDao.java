package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Conseiller;



public interface ConseillerDao {
	Conseiller findById(int id);
	
	Conseiller findByName(String name);
	
	void save(Conseiller conseiller);
	
	void deleteConseillerById(int id);
	
	Collection<Conseiller> findAllConseillers();
	
	void deleteAllConseillers();

}
