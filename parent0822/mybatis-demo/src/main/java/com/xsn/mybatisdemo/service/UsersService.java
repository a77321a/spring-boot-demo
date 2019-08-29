package com.xsn.mybatisdemo.service;

import com.xsn.mybatisdemo.model.Users;

public interface UsersService {

    Users findUsers(String name);
    void insertUser(Users users);
}
