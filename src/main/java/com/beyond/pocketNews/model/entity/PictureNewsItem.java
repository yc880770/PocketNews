package com.beyond.pocketNews.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
public class PictureNewsItem {
    private int pictureNewsItemId;
    private String pictureNewsItemContent;
    private String pictureNewsItemPicPath;
    private int pictureNewsItemPictureNewsId;
    private int pictureNewsItemOrderIndex;

    public int getPictureNewsItemId() {
        return pictureNewsItemId;
    }

    public void setPictureNewsItemId(int pictureNewsItemId) {
        this.pictureNewsItemId = pictureNewsItemId;
    }

    public String getPictureNewsItemContent() {
        return pictureNewsItemContent;
    }

    public void setPictureNewsItemContent(String pictureNewsItemContent) {
        this.pictureNewsItemContent = pictureNewsItemContent;
    }

    public String getPictureNewsItemPicPath() {
        return pictureNewsItemPicPath;
    }

    public void setPictureNewsItemPicPath(String pictureNewsItemPicPath) {
        this.pictureNewsItemPicPath = pictureNewsItemPicPath;
    }

    public int getPictureNewsItemPictureNewsId() {
        return pictureNewsItemPictureNewsId;
    }

    public void setPictureNewsItemPictureNewsId(int pictureNewsItemPictureNewsId) {
        this.pictureNewsItemPictureNewsId = pictureNewsItemPictureNewsId;
    }

    public int getPictureNewsItemOrderIndex() {
        return pictureNewsItemOrderIndex;
    }

    public void setPictureNewsItemOrderIndex(int pictureNewsItemOrderIndex) {
        this.pictureNewsItemOrderIndex = pictureNewsItemOrderIndex;
    }
}
