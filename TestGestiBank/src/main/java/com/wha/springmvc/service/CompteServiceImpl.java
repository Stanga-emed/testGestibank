package com.wha.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.springmvc.dao.CompteDao;
import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.CompteCourant;
import com.wha.springmvc.model.CompteRemunerateur;


@Service("compteService")
@Transactional

public class CompteServiceImpl implements CompteService {
	
	

	
	@Autowired
	private CompteDao compteDao ;


	@Override
	public Compte  findCompteById(int id1,int id2) {
		return compteDao.findCompteById(id1,id2);
	}

	@Override
	public List<Compte> findAllComptesRemunateurs() {
		return compteDao.findAllComptesRemunateurs();
	}

	@Override
	public List<Compte> findAllComptesCourant() {
		return compteDao.findAllComptesCourant();
	}

	@Override
	public CompteRemunerateur saveCompteRemunerateur(CompteRemunerateur cr) {
		return compteDao.saveCompteRemunerateur(cr);
	}

	@Override
	public CompteCourant saveCompteCourant(CompteCourant cpc) {
		return compteDao.saveCompteCourant(cpc);
	}
	public Compte saveCompte(Compte compte) {
		return compteDao.saveCompte(compte);
	}

	@Override
	public List<Compte> findComptesClient(int id) {
		// TODO Auto-generated method stub
		return compteDao.findComptesClient(id);
	}

	@Override
	public List<Compte> findAllComptes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
