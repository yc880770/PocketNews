package com.beyond.pocketNews.model.dao.picture;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.PictureNews;
import com.beyond.pocketNews.model.entity.PictureNewsItem;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public interface PictureNewsItemDao extends BaseDao {
    public PictureNews findById(int id) throws SQLException;
    public int insert(PictureNewsItem pictureNewsItem) throws  SQLException;
    public boolean update(PictureNewsItem pictureNewsItem) throws  SQLException;
    public boolean delete(PictureNewsItem pictureNewsItem) throws  SQLException;

}
