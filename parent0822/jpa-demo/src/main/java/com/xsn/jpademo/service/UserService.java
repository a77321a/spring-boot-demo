package com.xsn.jpademo.service;

import com.xsn.jpademo.model.User;

public interface UserService {
    void addUser(User user);
    User findUser(String name);
}
