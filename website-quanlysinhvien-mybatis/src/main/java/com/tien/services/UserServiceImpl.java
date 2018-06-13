package com.tien.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tien.mappers.UserMapper;
import com.tien.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private  UserMapper userMapper;
	
	@Transactional
	public void insertUser(User user) {
		userMapper.insert(user);
	}
	
	@Transactional
	public void deleteUser(String username) {
		userMapper.deleteByName(username);
	}
	
	@Transactional
	public void changePassword(User user) {
		userMapper.update(user);
		
	}

	public boolean login(String username, String password) {
		User user = userMapper.getByName(username);
		if ((user != null)&& (user.getPassword().equals(password))){
			return true;
		}
		return false;
	}

	public boolean signUp(String username) {
		User user = userMapper.getByName(username);
		if (user != null) return false;
		return true;
	}

}
