package com.hlkjxn.service.impl;

import com.hlkjxn.dao.UserDao;
import com.hlkjxn.model.User;
import com.hlkjxn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    //依赖Dao
    @Resource
    private UserDao userDao;
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
