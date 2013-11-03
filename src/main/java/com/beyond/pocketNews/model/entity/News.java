package com.beyond.pocketNews.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public class News {
    private int newsId;
    private String newsTitle;
    private String newsContent;
    private String newsCoverPath;
    private int  newsCategoryId;
    private int  newsAuditStatus;
    private Date newsCreateTime;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsCoverPath() {
        return newsCoverPath;
    }

    public void setNewsCoverPath(String newsCoverPath) {
        this.newsCoverPath = newsCoverPath;
    }

    public int getNewsCategoryId() {
        return newsCategoryId;
    }

    public void setNewsCategoryId(int newsCategoryId) {
        this.newsCategoryId = newsCategoryId;
    }

    public int getNewsAuditStatus() {
        return newsAuditStatus;
    }

    public void setNewsAuditStatus(int newsAuditStatus) {
        this.newsAuditStatus = newsAuditStatus;
    }

    public Date getNewsCreateTime() {
        return newsCreateTime;
    }

    public void setNewsCreateTime(Date newsCreateTime) {
        this.newsCreateTime = newsCreateTime;
    }
}
