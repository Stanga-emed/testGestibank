package com.wha.springmvc.service;

import java.util.List;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.CompteCourant;
import com.wha.springmvc.model.CompteRemunerateur;

public interface CompteService {
	
	
	List<Compte> findAllComptes();
	Compte findCompteById(int id1,int id2);
	
	List<Compte> findComptesClient(int id);
	

    List<Compte> findAllComptesRemunateurs();
	List<Compte> findAllComptesCourant();
  

	CompteRemunerateur saveCompteRemunerateur(CompteRemunerateur cr);
	CompteCourant saveCompteCourant(CompteCourant cc1);	
	
	Compte saveCompte(Compte compte);
	
}
