package com.beyond.pocketNews.model.manager.news;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.News;
import com.beyond.pocketNews.model.entity.NewsComment;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public interface NewsCommentManager extends BaseDao {
    public News findById(int id) throws SQLException;
    public int insert(NewsComment newsComment) throws  SQLException;
    public boolean update(NewsComment newsComment) throws  SQLException;
    public boolean delete(NewsComment newsComment) throws  SQLException;

}
