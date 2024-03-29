package com.crudapp.crud.services;

import java.util.List;

import com.crudapp.crud.model.User;

public interface UserService {
	
	public User addUser(User user);
	
	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User editUser(User user);
	
	public User deleteUser(long userId);
}