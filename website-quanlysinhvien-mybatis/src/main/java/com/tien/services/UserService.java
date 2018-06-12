package com.tien.services;

import com.tien.model.User;

public interface UserService {
	  void insertUser(User user);
	  void deleteUser(String username);
	  void changePassword(User user);
	  boolean login(String username, String password);
	  boolean signUp(String username);
}
