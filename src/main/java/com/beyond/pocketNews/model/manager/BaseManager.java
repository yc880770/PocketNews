package com.beyond.pocketNews.model.manager;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:22
 * To change this template use File | Settings | File Templates.
 */
public interface BaseManager {
    public List<Map<String,Object>> find() throws SQLException;
}
