package com.help996.shopservice.service;

import com.help996.shopdao.entity.po.User;

/**
 * @author zzf
 * @date 2020/5/9 15:49
 */
public interface UserService {

    User getUser(String userId);
}
