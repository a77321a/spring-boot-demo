package com.xsn.redisdemo.service;

import com.xsn.redisdemo.dao.UsersMapper;
import com.xsn.redisdemo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Cacheable(value = "myname")
    @Override
    @Transactional
    public Users findUsers(String name) {
        System.out.println("从数据库中查询。。。");
        return usersMapper.findUserByName(name);

    }

    @Override
    public void insertUser(Users users) {
        usersMapper.insertUser(users.getName(),users.getPassword());
    }
}
