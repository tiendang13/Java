package com.tien.dao;
import com.tien.domain.User;

public interface UserDao {

    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  

}
