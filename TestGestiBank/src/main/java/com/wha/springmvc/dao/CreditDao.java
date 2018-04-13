package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.Credit;

public interface CreditDao {

	
Credit findBynumopr(int numopr);
	
	
	void save(Credit credit);
	
	void deleteCreditBynumopr(int numopr);
	
	Collection<Credit> findAllCredits();
	
	void deleteAllCredits();
}
