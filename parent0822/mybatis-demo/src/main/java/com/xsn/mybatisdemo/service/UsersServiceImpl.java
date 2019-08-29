package com.xsn.mybatisdemo.service;

import com.xsn.mybatisdemo.dao.UsersMapper;
import com.xsn.mybatisdemo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users findUsers(String name) {
        return usersMapper.findUserByName(name);
    }

    @Override
    public void insertUser(Users users) {
        usersMapper.insertUser(users.getName(),users.getPassword());
    }
}
