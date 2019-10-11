package com.hlkjxn.service;

import com.hlkjxn.model.User;

public interface UserService {
    User getUser(Integer uid);
    void saveUser(User user);
}
