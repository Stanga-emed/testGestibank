package com.wha.springmvc.service;

import java.util.Collection;

import com.wha.springmvc.model.Conseiller;

public interface ConseillerService {

	
	
	Conseiller findById(long id);
	
	Conseiller findByName(String name);
	
	void saveConseiller(Conseiller conseiller);
	
	void updateConseiller(Conseiller conseiller);
	
	void deleteConseillerById(long id);

	Collection<Conseiller> findAllConseillers(); 
	
	void deleteAllConseillers();
	
	public boolean isConseillerExist(Conseiller conseiller);


}
