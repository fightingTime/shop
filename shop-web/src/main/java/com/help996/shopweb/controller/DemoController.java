package com.help996.shopweb.controller;

import com.help996.shopbase.utils.JsonResult;
import com.help996.shopdao.entity.po.User;
import com.help996.shopservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 * @date 2020/5/9 15:57
 */
@RestController
public class DemoController {


    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public JsonResult getUser(String userId) {
        System.out.println("----");
        User user = userService.getUser(userId);
        JsonResult result = new JsonResult(user);
        return result;
    }

}
