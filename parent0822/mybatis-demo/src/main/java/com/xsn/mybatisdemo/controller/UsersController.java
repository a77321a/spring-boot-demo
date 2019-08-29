package com.xsn.mybatisdemo.controller;

import com.xsn.mybatisdemo.model.Users;
import com.xsn.mybatisdemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("findUser")
    public Users findUsers(String name){
        return usersService.findUsers(name);
    }
    @RequestMapping("/addUser")
    public String insertUser(){
        Users users = new Users();
        users.setName("张三");
        users.setPassword("88888");
        usersService.insertUser(users);
        return "ok";
    }
}
