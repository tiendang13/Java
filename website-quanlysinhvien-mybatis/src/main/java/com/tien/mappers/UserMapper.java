package com.tien.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tien.model.User;

@Repository("userMapper")
public interface UserMapper {
	void insert(User user);
    void update(User user);
    void deleteByName(String name);
    List<User> getAll();
    User getByName(String username);
}
