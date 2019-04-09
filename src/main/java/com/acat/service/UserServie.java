package com.acat.service;

import com.acat.entity.UserEntity;

public interface UserServie {

    UserEntity login(String wx_user_username, String wx_user_password);

}
