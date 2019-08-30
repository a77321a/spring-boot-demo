package com.xsn.jpademo.controller;

import com.xsn.jpademo.model.User;
import com.xsn.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String saveUser(){
        User user = new User();
        user.setName("小花");
        user.setPassword("123456");
        user.setEmail("18188@qq.com");
        user.setBrithday(new Date());

        userService.addUser(user);
        return "ok";
    }
}
