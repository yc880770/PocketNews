package com.beyond.pocketNews.model.dao.user.impl;

import com.beyond.pocketNews.model.HibernateSessionFactory;
import com.beyond.pocketNews.model.dao.user.RoleDao;
import com.beyond.pocketNews.model.entity.EntityConstant;
import com.beyond.pocketNews.model.entity.Role;
import com.beyond.pocketNews.model.entity.User;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-4
 * Time: 下午10:38
 * To change this template use File | Settings | File Templates.
 */
public class RoleDaoImpl implements RoleDao {
    @Override
    public Role findById(int id) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        Role role = (Role) session.get(Role.class,id);
        return role;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int insert(Role role) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        session.getTransaction().begin();
        session.save(role);
        session.getTransaction().commit();
        return role.getRoleId();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(Role role) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        session.getTransaction().begin();
        session.update(role);
        session.getTransaction().commit();
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Role role) throws SQLException {
        Session session = HibernateSessionFactory.getSession();
        session.getTransaction().begin();
        session.delete(role);
        session.getTransaction().commit();
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, Object>> find() throws SQLException {
        Session session = HibernateSessionFactory.getSession();
//        String hql = "from Role where roleStatus<> "+ EntityConstant.STATUS_DELETE;

//        session.createQuery(hql);

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
