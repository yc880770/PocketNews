package com.beyond.pocketNews.model.dao.user.impl;

import com.beyond.pocketNews.model.HibernateSessionFactory;
import com.beyond.pocketNews.model.dao.user.UserDao;
import com.beyond.pocketNews.model.entity.User;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-4
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User findById(int id) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        session.get(User.class,id);
        User user = (User) session.get(User.class,id);
        return user;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User findByNameAndPassword(String name, String password) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        String hql = "from User where userName="+name+" and userPassword="+password;
        User user = (User) session.createQuery(hql);
        return user;
    }

    @Override
    public int insert(User user) throws SQLException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(User user) throws SQLException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, Object>> find() throws SQLException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


}
