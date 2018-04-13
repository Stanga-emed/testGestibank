package com.wha.springmvc.service;

import java.sql.SQLException;
import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wha.springmvc.dao.UserDao;
import com.wha.springmvc.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao;
	
	
	
	

	public Collection<User> findAllUsers(String type) {
	
		return dao.findAllUsers((String) type);
	}
	
	public User findById(long id) {

		return dao.findById((int)id);
	}
	
	public User findByName(String name) {

		return dao.findByName((String) name);
	}
	
	public void saveUser(User user) {
	
		dao.save(user);
	}

	//affecte une demande d'inscription
	public void updateUser(User user) {
	
		
		User entity = dao.findById((int)user.getId());
		if(entity!=null){
			entity.setUsername(user.getUsername());
			entity.setAddress(user.getAddress());
			entity.setEmail(user.getEmail());
			entity.setAffectation(user.getAffectation());
			
		}
		dao.save(entity);
	}

	public void deleteUserById(long id) {

		dao.deleteUserById((int) id);
		
	}

	public boolean isUserExist(User user) {
		return dao.findByName((String) user.getUsername())!=null;
	}
	
	public void deleteAllUsers(){
		dao.deleteAllUsers();
	}

	@Override
	public User isValidUser(String username, String pwd) {
		
		return dao.isValidUser(username, pwd);
	}

	@Override
	public Collection<User> findAllAffectedUsers(int affectation) {
		return dao.findAllAffectedUsers((int) affectation);
	}

	

	
	
	

}
