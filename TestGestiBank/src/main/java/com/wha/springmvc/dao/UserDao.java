package com.wha.springmvc.dao;

import java.util.Collection;

import com.wha.springmvc.model.User;

public interface UserDao {
	
	User findById(int id);
	
	User findByName(String name);
	
	void save(User user);
	
	void deleteUserById(int id);
	
	//affiche toutes les demandes
	Collection<User> findAllUsers(String type);
	
	//affiche toutes les affecations
	Collection<User> findAllAffectedUsers(int affectation);
	
	void deleteAllUsers();
	
	User isValidUser(String username, String pwd);
   
    
    
}
