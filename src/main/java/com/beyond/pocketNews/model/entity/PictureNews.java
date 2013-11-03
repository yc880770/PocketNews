package com.beyond.pocketNews.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午4:08
 * To change this template use File | Settings | File Templates.
 */
public class PictureNews {
    private int pictureNewsId;
    private String pictureNewsTitle;
    private int pictureNewsAuditStatus;
    private int pictureNewsLikeCount;
    private Date pictureNewsCreateTime;

    public int getPictureNewsId() {
        return pictureNewsId;
    }

    public void setPictureNewsId(int pictureNewsId) {
        this.pictureNewsId = pictureNewsId;
    }

    public String getPictureNewsTitle() {
        return pictureNewsTitle;
    }

    public void setPictureNewsTitle(String pictureNewsTitle) {
        this.pictureNewsTitle = pictureNewsTitle;
    }

    public int getPictureNewsAuditStatus() {
        return pictureNewsAuditStatus;
    }

    public void setPictureNewsAuditStatus(int pictureNewsAuditStatus) {
        this.pictureNewsAuditStatus = pictureNewsAuditStatus;
    }

    public int getPictureNewsLikeCount() {
        return pictureNewsLikeCount;
    }

    public void setPictureNewsLikeCount(int pictureNewsLikeCount) {
        this.pictureNewsLikeCount = pictureNewsLikeCount;
    }

    public Date getPictureNewsCreateTime() {
        return pictureNewsCreateTime;
    }

    public void setPictureNewsCreateTime(Date pictureNewsCreateTime) {
        this.pictureNewsCreateTime = pictureNewsCreateTime;
    }
}
