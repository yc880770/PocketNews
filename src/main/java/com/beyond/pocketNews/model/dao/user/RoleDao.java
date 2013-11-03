package com.beyond.pocketNews.model.dao.user;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.Role;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public  interface RoleDao extends BaseDao {
    public Role findById(int id) throws SQLException;
    public int insert(Role role) throws SQLException;
    public boolean update(Role role) throws SQLException;
    public boolean delete(Role role) throws SQLException;

}
