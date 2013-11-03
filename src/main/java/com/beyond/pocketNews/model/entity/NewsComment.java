package com.beyond.pocketNews.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午4:05
 * To change this template use File | Settings | File Templates.
 */
public class NewsComment {
    private int newsCommentId;
    private String newsCommentName;
    private String newsCommentContent;
    private int newsCommentNewsId;
    private Date newsCommentCreateTime;

    public int getNewsCommentId() {
        return newsCommentId;
    }

    public void setNewsCommentId(int newsCommentId) {
        this.newsCommentId = newsCommentId;
    }

    public String getNewsCommentName() {
        return newsCommentName;
    }

    public void setNewsCommentName(String newsCommentName) {
        this.newsCommentName = newsCommentName;
    }

    public String getNewsCommentContent() {
        return newsCommentContent;
    }

    public void setNewsCommentContent(String newsCommentContent) {
        this.newsCommentContent = newsCommentContent;
    }

    public int getNewsCommentNewsId() {
        return newsCommentNewsId;
    }

    public void setNewsCommentNewsId(int newsCommentNewsId) {
        this.newsCommentNewsId = newsCommentNewsId;
    }

    public Date getNewsCommentCreateTime() {
        return newsCommentCreateTime;
    }

    public void setNewsCommentCreateTime(Date newsCommentCreateTime) {
        this.newsCommentCreateTime = newsCommentCreateTime;
    }
}
