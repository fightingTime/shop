package com.help996.shopweb.controller;

import com.help996.shopbase.utils.JsonResult;
import com.help996.shopdao.entity.po.User;
import com.help996.shopservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zzf
 * @date 2020/5/9 15:57
 */
@RestController
public class DemoController {


    @GetMapping("/hello")
    public String hello() {
        return "Spring Security";
    }

    @Autowired
    private UserService userService;

//    @PostMapping("/doLogin")
//    public String doLogin(@RequestParam(value = "username", required = true) String username,
//                              @RequestParam(value = "password", required = true) String password) {
//        System.out.println("----");
//        User user = userService.getUser("1");
//        JsonResult result = new JsonResult(user);
//        return "1";
//    }
//
//    @GetMapping("/getuser")
//    public JsonResult getUser() {
//        System.out.println("----");
//        User user = userService.getUser("1");
//        JsonResult result = new JsonResult(user);
//        return result;
//    }


}
