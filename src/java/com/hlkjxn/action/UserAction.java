package com.hlkjxn.action;

import com.hlkjxn.model.User;
import com.hlkjxn.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;


public class UserAction extends ActionSupport {
    private User user;

    @Resource
    private UserService userService;

    public User getUser(){
        return user;
    }
    public String m1(){
        user = userService.getUser(1);
        System.out.println(user.getUname());
        return SUCCESS;
    }
    public String saveUser(){
        User user = new User();
        user.setUname("事务提交成功");
        userService.saveUser(user);
        return SUCCESS;
    }
}
