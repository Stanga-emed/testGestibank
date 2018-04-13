package com.wha.springmvc.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Credit;
@Repository("creditDao")
public class CreditDaoImpl extends AbstractDao<Integer, Credit> implements CreditDao {

	@Override
	public Credit findBynumopr(int numopr) {
		Credit credit = getByKey(numopr);
		return credit;
	}

	@Override
	public void save(Credit credit) {
		// TODO Auto-generated method stub
		persist(credit);

	}

	@Override
	public void deleteCreditBynumopr(int numopr) {
		// TODO Auto-generated method stub
		Credit credit = getByKey(numopr);
		delete(credit);
	}

	@Override
	public Collection<Credit> findAllCredits() {
		@SuppressWarnings("unchecked")
		Collection<Credit> credits = getEntityManager().createQuery("SELECT u FROM Credit u ORDER BY u.numopr ASC").getResultList();				
		return credits;
	}

	@Override
	public void deleteAllCredits() {
		// TODO Auto-generated method stub

	}

}
