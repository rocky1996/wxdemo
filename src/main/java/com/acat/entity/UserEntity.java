package com.acat.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * #1.登录注册表
 * drop table if exists wx_user;
 * create table `wx_user`(
 *     `wx_user_id` int(10) not null auto_increment,
 *     `wx_user_username` varchar(20) not null COMMENT '用户名',
 *     `wx_user_password` varchar(35) not null COMMENT '用户密码',
 *     primary key (`wx_user_id`)
 * )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */

@ToString
@Setter
@Getter
@Entity
@Table(name = "wx_user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wx_user_id;

    private String wx_user_username;

    private String wx_user_password;

}
