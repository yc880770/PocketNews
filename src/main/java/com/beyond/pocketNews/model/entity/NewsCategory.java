package com.beyond.pocketNews.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午4:04
 * To change this template use File | Settings | File Templates.
 */
public class NewsCategory
{
    private int newsCategoryId;
    private String newsCategoryName;
    private int newsCategoryOrderIndex;

    public int getNewsCategoryId() {
        return newsCategoryId;
    }

    public void setNewsCategoryId(int newsCategoryId) {
        this.newsCategoryId = newsCategoryId;
    }

    public String getNewsCategoryName() {
        return newsCategoryName;
    }

    public void setNewsCategoryName(String newsCategoryName) {
        this.newsCategoryName = newsCategoryName;
    }

    public int getNewsCategoryOrderIndex() {
        return newsCategoryOrderIndex;
    }

    public void setNewsCategoryOrderIndex(int newsCategoryOrderIndex) {
        this.newsCategoryOrderIndex = newsCategoryOrderIndex;
    }
}
