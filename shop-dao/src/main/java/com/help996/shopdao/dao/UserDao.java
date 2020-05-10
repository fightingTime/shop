package com.help996.shopdao.dao;

import com.help996.shopdao.entity.po.User;
import org.springframework.stereotype.Repository;

/**
 * @author zzf
 * @date 2020/5/9 15:52
 */
@Repository
public class UserDao {


    public User getUser(){

        User user = new User();
        user.setName("sdf");
        user.setAddress("123");
        return user;
    }
}
