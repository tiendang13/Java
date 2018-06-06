package com.tien.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tien.dao.UserDao;
import com.tien.domain.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; 
	
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId); 
	}
}
