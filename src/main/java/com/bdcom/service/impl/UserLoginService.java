package com.bdcom.service.impl;

import com.bdcom.dao.mapper.UserMapper;
import com.bdcom.entity.User;
import com.bdcom.service.IUserLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Slf4j
@Service
public class UserLoginService implements IUserLoginService{

    /**
     * 注入dao
     */
    @Autowired
    private UserMapper usermapper;

    //用户登录
    public User userLogin(String username, String password){
        User user = usermapper.selectByNamePass(username,password);
        return user;
    }

    //注册新用户
    public int adduser(String username,String password,int age){

        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        log.info("register new user:"+username );
        return usermapper.insert(user);
    }
}