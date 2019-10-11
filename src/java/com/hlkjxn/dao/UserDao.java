package com.hlkjxn.dao;

import com.hlkjxn.model.User;

public interface UserDao {
    User getUser(Integer uid);
    void saveUser(User user);
}
