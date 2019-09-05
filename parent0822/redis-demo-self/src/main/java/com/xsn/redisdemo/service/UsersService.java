package com.xsn.redisdemo.service;


import com.xsn.redisdemo.model.Users;

public interface UsersService {

    Users findUsers(String name);
    void insertUser(Users users);
}
