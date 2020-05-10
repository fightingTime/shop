package com.help996.shopservice.service.impl;

import com.help996.shopdao.entity.po.User;
import com.help996.shopdao.mapper.UserMapper;
import com.help996.shopservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzf
 * @date 2020/5/9 15:49
 */
@Service
public class UserviceServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userId) {
        return userMapper.getUser(userId);
    }
}
