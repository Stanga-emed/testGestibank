package com.wha.springmvc.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.wha.springmvc.model.Administrator;
import com.wha.springmvc.model.Client;
import com.wha.springmvc.model.Conseiller;
import com.wha.springmvc.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	@Override
	public User findById(int id) {
		User user = getByKey(id);
		return user;
	}

	@Override
	public User findByName(String name) {
		System.out.println("name: "+ name);
		try {
			User user = (User) getEntityManager().createQuery("SELECT u FROM User u WHERE u.username LIKE :name").setParameter("name", name).getSingleResult();
			return user;
			
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Override
	public void save(User user) {
		persist(user);

	}

	@Override
	public void deleteUserById(int id) {
		User user = getByKey(id);
		delete(user);

	}

	//affiche toutes les demandes
	@SuppressWarnings("unchecked")
	public Collection<User> findAllUsers(String type) {
		List<User> users = getEntityManager().createQuery("SELECT u FROM User u WHERE u.Role LIKE :role ORDER BY u.username ASC").setParameter("role", type).getResultList();				
		return users;
	}

	
	public void deleteBySSO(String sso){
		User user = (User) getEntityManager().createQuery("SELECT u FROM User u WHERE u.ssoId LIKE :ssoId").setParameter("ssoId", sso).getSingleResult();
		delete(user);
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub

	}
	
	//An alternative to Hibernate.initialize()
	protected void initializeCollection(Collection<?> collection){
		if (collection==null) {
			return;
		}
		collection.iterator().hasNext();
	}
	
	
	@Override
	public User isValidUser(String username, String pwd){
		
//		String client = "CLIENT";
//		String admin = "ADMIN";
//		String conseiller ="CONSEILLER";
	
		User u = (User) getEntityManager().createQuery("SELECT u FROM User as u WHERE u.username = :usernameU AND u.pwd = :pwdP")
				.setParameter("usernameU", username)
				.setParameter("pwdP", pwd)
				.getSingleResult();
			
			if (u!=null) {
				if (u instanceof Client)
				{return u;}
				
				if (u instanceof Administrator)
				{return u;}
				
				if (u instanceof Conseiller)
				{return u;}
			
			 }
			return u;
	}

	@SuppressWarnings("unchecked")
	public Collection<User> findAllAffectedUsers(int affectation) {
		List<User> users = getEntityManager().createQuery("SELECT u FROM User u WHERE u.affectation LIKE :int ORDER BY u.username ASC").setParameter("int", affectation).getResultList();				
		return users;
	}

	
	
	
}
