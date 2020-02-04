package com.bdcom.service;

import com.bdcom.entity.User;

/**
 * Created by cjzm888999 on 2020/2/2.
 */
public interface IUserLoginService {
    public User userLogin(String username, String password);
    public int adduser(String username,String password,int age);
}
