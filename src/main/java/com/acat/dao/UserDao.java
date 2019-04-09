package com.acat.dao;

import com.acat.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<UserEntity,Integer> {

    @Query(value = "select en from UserEntity en where en.wx_user_username=?1 and en.wx_user_password=?2")
    UserEntity login(String wx_user_username,String wx_user_password);

}
