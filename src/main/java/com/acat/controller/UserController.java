package com.acat.controller;

import com.acat.entity.UserEntity;
import com.acat.service.UserServie;
import com.acat.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@SuppressWarnings("all")
public class UserController {

    @Autowired
    private UserServie userServie;

    @PostMapping("/login")
    public UserEntity login(@RequestBody LoginVo loginVo){

        System.out.println(loginVo);


        UserEntity userEntity = userServie.login(loginVo.getWx_user_username(),loginVo.getWx_user_password());

        if(userEntity != null){
            return userEntity;
        }

        return null;
    }

}
