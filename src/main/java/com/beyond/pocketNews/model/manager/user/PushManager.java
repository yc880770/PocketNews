package com.beyond.pocketNews.model.manager.user;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.Push;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public  interface PushManager extends BaseDao {
    public Push findById(int id) throws SQLException;
    public int insert(Push push) throws SQLException;
    public boolean update(Push push) throws SQLException;
    public boolean delete(Push push) throws SQLException;

}
