package com.xsn.redisdemo.controller;

import com.xsn.redisdemo.model.Users;
import com.xsn.redisdemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableCaching   //开启缓存
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
        users.setName("王欢11");
        users.setPassword("88888");
        usersService.insertUser(users);
        return "ok";
    }
}
