package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Debit;

public interface DebitDao {

	
Debit findBynumopr(int numopr);
	
	
	void save(Debit debit);
	
	void deleteDebitBynumopr(int numopr);
	
	Collection<Debit> findAllDebits();
	
	void deleteAllDebits();
}
