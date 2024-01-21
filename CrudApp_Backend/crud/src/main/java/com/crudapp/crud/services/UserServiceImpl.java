package com.crudapp.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.crud.database.UserDatabase;
import com.crudapp.crud.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDatabase userDao;

	@Override
	public User addUser(User user){
		
		userDao.save(user);
		return user;
	}
	
    @Override
    public List<User> getUsers(){
    	return userDao.findAll();
    }
    
    @Override
    public User getUser(long userId) {
    	return userDao.findById(userId).get();
    }
    
    @Override
	public User editUser(User user){
    	userDao.save(user);
		return user;
    }

    @Override
	public User deleteUser(long userId) {
    	User user = userDao.findById(userId).get();
    	userDao.delete(user);
    	return user;
    }
}
