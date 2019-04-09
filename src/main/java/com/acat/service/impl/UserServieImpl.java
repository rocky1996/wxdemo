package com.acat.service.impl;

import com.acat.dao.UserDao;
import com.acat.entity.UserEntity;
import com.acat.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServie")
public class UserServieImpl implements UserServie {

    @Autowired
    private UserDao userDao;

    public UserEntity login(String wx_user_username, String wx_user_password){
        return userDao.login(wx_user_username,wx_user_password);
    }

}
