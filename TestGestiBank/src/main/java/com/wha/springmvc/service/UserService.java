package com.wha.springmvc.service;

import java.util.Collection;

import com.wha.springmvc.model.User;




public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	//affecte une demande
	void updateUser(User user);
	
	void deleteUserById(long id);

	Collection<User> findAllUsers(String type); 
	
	//affiche toutes les affecations
		Collection<User> findAllAffectedUsers(int affectation);
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
	public User isValidUser(String username, String pwd);
	
}
