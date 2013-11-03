package com.beyond.pocketNews.model.manager.picture;

import com.beyond.pocketNews.model.dao.BaseDao;
import com.beyond.pocketNews.model.entity.News;
import com.beyond.pocketNews.model.entity.PictureNews;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-3
 * Time: 上午10:41
 * To change this template use File | Settings | File Templates.
 */
public interface PictureNewsManager extends BaseDao {
    public PictureNews findById(int id) throws SQLException;
    public int insert(PictureNews pictureNews) throws  SQLException;
    public boolean update(PictureNews pictureNews) throws  SQLException;
    public boolean delete(PictureNews pictureNew) throws  SQLException;

}
