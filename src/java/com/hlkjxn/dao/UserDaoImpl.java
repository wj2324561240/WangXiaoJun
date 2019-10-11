package com.hlkjxn.dao;

import com.hlkjxn.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    public User getUser(Integer uid) {
        //调用该方法时绑定 事务后，可以用session的getcurrents来获取事务
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class,uid);
        return user;
    }
    public void saveUser(User user) {
        //使用getcurrentsession来获取事务，hibernate会自动维护session的关闭
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        System.out.println("======="+user.getUname());
    }
}
