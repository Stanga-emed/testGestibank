package com.wha.springmvc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.Credit;
import com.wha.springmvc.model.Debit;
import com.wha.springmvc.model.Operation;
@Repository("operationDao")
public class OperationDaoImlp extends AbstractDao<Integer, Operation> implements OperationDao {

	@SuppressWarnings("unchecked")

	@Override
	public void rentrait() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Debit saveDebit(Debit debit) {
		persist(debit);
		return debit;
	}

	@Override
	public Credit saveCredit(Credit credit) {
		persist(credit);
		return credit;
	}

	@Override
	public List<Operation> findAllOperation() {
		List<Operation> list = getEntityManager().createQuery("SELECT op FROM Operation op ").getResultList();;
		return list;
}

	@Override
	public void depot(Compte cp, double montant) {
		// TODO Auto-generated method stub
		
	double solde=cp.getSolde();
	solde=cp.getSolde()+montant;
	cp.setSolde(solde);
	Credit credit =new Credit( new Date(),montant ,"libelle1",cp);
	
	
	}

	@Override
	public Operation saveOperation(Operation op) {
		persist(op);
		return op;
	}

	@Override
	public List<Operation> findOprationsCompte(int id) {
		// TODO Auto-generated method stub
		
	List<Operation> listOperations=  getEntityManager().createQuery("SELECT op FROM Operation op where op.compte.numeroCompte= :idcompte")
				.setParameter("idcompte", id).getResultList();		
		
		return listOperations;
	}

	
	
	

}
