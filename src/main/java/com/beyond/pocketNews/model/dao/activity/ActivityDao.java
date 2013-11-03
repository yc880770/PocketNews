package com.beyond.pocketNews.model.dao.activity;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.Activity;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:11
 * To change this template use File | Settings | File Templates.
 */
public  interface  ActivityDao extends BaseDao {
    public Activity findById(int id) throws SQLException;
    public boolean delete(int id) throws SQLException;
    public int insert(Activity activity) throws SQLException;
    public boolean update(Activity activity) throws SQLException;
//    public List<Map<String,Object>> find()throws SQLException;


}
