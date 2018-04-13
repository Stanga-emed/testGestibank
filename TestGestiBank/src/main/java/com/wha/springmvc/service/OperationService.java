package com.wha.springmvc.service;

import java.util.List;

import com.wha.springmvc.model.Credit;
import com.wha.springmvc.model.Debit;
import com.wha.springmvc.model.Operation;

public interface OperationService {
	
List<Operation> findOprationsCompte(int id );
	
	
	
	void depot();
	
	void rentrait();
	
	Debit saveDebit(Debit debit);
	Credit saveCredit(Credit credit);
	
	List<Operation> findAllOperation();
	Operation saveOperation(Operation op);
}
