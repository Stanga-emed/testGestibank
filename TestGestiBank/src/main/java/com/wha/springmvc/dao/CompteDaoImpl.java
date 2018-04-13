package com.wha.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.CompteCourant;
import com.wha.springmvc.model.CompteRemunerateur;

@Repository("compteDao")
public class CompteDaoImpl extends AbstractDao<Integer, Compte> implements CompteDao {

	@SuppressWarnings("unchecked")
	public List<Compte> findAllComptes() {
		List<Compte> Comptes = getEntityManager().createQuery("SELECT cp FROM Compte cp ").getResultList();

		return Comptes;
	}

//	@Override
//	public Compte findCompteById(int id) {
//		Compte compte = getByKey(id);
//		return compte;
//	}
	
//	
//	@Override
//	public Compte findCompteById(int id1 ,int id2) {
//		Compte compte = getEntityManager().createQuery("SELECT cp FROM Compte cp where cp.numeroCompte= :idcompte and cp.client.id = :idcli")
//				.setParameter("idcompte", id1)
//				.setParameter("idcli", id2)
//				.getSingleResult();
//		return compte;
//		
//		
//	}
//	
	@Override
	public Compte findCompteById(int id1 ,int id2) {
Compte compte = (Compte) getEntityManager().createQuery("SELECT cp FROM Compte cp where id_client="+id1 +"and numeroCompte="+id2).getSingleResult();
		return compte;
		
		
		/*  "SELECT c FROM Customer c WHERE c.name LIKE :custName")
        .setParameter("custName", name)
        .getResultList();*/
	}
	

	

	@Override
	public CompteCourant saveCompteCourant(CompteCourant cpc) {
		// TODO Auto-generated method stub
		persist(cpc);
		return cpc;

	}

	@SuppressWarnings("unchecked")
	
	public List<Compte> findAllComptesRemunateurs() {
		List<Compte> ComptesRemun = getEntityManager().createQuery("SELECT cr FROM Compte cr where type_compte='CR' ")
				.getResultList();
		return ComptesRemun;

	}
	

	@SuppressWarnings("unchecked")

	public List<Compte> findAllComptesCourant() {
		List<Compte> ComptesRemun = getEntityManager().createQuery("SELECT cr FROM Compte cr where type_compte='CC' ")
				.getResultList();
		return ComptesRemun;

	}

	@Override
	public CompteRemunerateur saveCompteRemunerateur(CompteRemunerateur cr) {
		persist(cr);
		return cr;
	}

	@Override
	public Compte saveCompte(Compte compte) {
		persist(compte);
		return compte;
	}

	@SuppressWarnings("unchecked")
	
	public List<Compte> findComptesClient(int id) {
		// TODO Auto-generated method stub
List<Compte> listComptes=  getEntityManager().createQuery("SELECT cp FROM Compte cp where cp.client.id = :idcli")
				.setParameter("idcli", id).getResultList();
		
		return listComptes;
	}

}
