package com.beyond.pocketNews.model.dao.user;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.Function;
import com.beyond.pocketNews.model.entity.Push;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:48
 * To change this template use File | Settings | File Templates.
 */
public  interface FunctionDao extends BaseDao {
    public Function findById(int id) throws SQLException;
    public int insert(Function function) throws SQLException;
    public boolean update(Function function) throws SQLException;
    public boolean delete(Function function) throws SQLException;

}
