package com.xsn.jpademo.service;

import com.xsn.jpademo.dao.UserDao;
import com.xsn.jpademo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findUser(String name) {
        return null;
    }
}
