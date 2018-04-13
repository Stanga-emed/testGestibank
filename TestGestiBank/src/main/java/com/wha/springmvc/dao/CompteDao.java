package com.wha.springmvc.dao;

import java.util.List;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.CompteCourant;
import com.wha.springmvc.model.CompteRemunerateur;

public interface CompteDao {
	
	
	

	List<Compte> findAllComptes();
	Compte findCompteById(int id1,int id2);
	List<Compte> findComptesClient(int id);
	
	
	
	List<Compte> findAllComptesRemunateurs();
	List<Compte> findAllComptesCourant();
  

	CompteRemunerateur saveCompteRemunerateur(CompteRemunerateur cr);
	CompteCourant saveCompteCourant(CompteCourant cpc);
	Compte saveCompte(Compte compte);
	


}
