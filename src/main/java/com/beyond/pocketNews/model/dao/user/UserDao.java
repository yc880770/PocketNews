package com.beyond.pocketNews.model.dao.user;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午7:11
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao extends BaseDao {
    public User findById(int id) throws SQLException;
    public User findByNameAndPassword(String name,String password) throws SQLException;
    public int insert(User user) throws  SQLException;
    public boolean update(User user) throws  SQLException;
//    public List<Map<String,Object>> find() throws  SQLException;


}