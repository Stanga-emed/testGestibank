package com.wha.springmvc.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Debit;
@Repository("debitDao")
public class DebitDaoImpl extends AbstractDao<Integer, Debit> implements DebitDao {

	@Override
	public Debit findBynumopr(int numopr) {
		Debit debit = getByKey(numopr);
		return debit;
	}

	@Override
	public void save(Debit debit) {
		// TODO Auto-generated method stub
		persist(debit);

	}

	@Override
	public void deleteDebitBynumopr(int numopr) {
		// TODO Auto-generated method stub
		Debit debit = getByKey(numopr);
		delete(debit);
	}

	@Override
	public Collection<Debit> findAllDebits() {
		@SuppressWarnings("unchecked")
		Collection<Debit> debits = getEntityManager().createQuery("SELECT u FROM Debit u ORDER BY u.numopr ASC").getResultList();				
		return debits;
	}

	@Override
	public void deleteAllDebits() {
		// TODO Auto-generated method stub

	}


}
