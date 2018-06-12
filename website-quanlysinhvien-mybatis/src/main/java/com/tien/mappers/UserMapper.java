package com.tien.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tien.model.User;

@Repository("userMapper")
public interface UserMapper {
	void insert(User user);
    void update(User user);
    void delete(@Param("username")String name);
    List<User> getAll();
    User getByName(@Param("username")String username);
}
