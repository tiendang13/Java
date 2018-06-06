package com.tien.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import com.tien.baseTest.SpringTestCase;  
import com.tien.domain.User;

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}