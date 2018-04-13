package com.wha.springmvc.dao;

import java.util.List;

import com.wha.springmvc.model.Compte;
import com.wha.springmvc.model.Credit;
import com.wha.springmvc.model.Debit;
import com.wha.springmvc.model.Operation;

public interface OperationDao {
	
	
	List<Operation> findOprationsCompte(int id );
	
	
	void depot(Compte cp ,double montant);
	
	void rentrait();
	
	Debit saveDebit(Debit debit);
	Credit saveCredit(Credit credit);
	
	List<Operation> findAllOperation();
	
	Operation saveOperation(Operation op);
	
}
