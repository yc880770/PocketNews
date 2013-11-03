package com.beyond.pocketNews.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午3:35
 * To change this template use File | Settings | File Templates.
 */
public class Activity {
    private int activityId;
    private  String activityTitle;
    private  String activityContent;
    private  String activityCoverPath;
    private  int  activityAuditStatus;
    private  Date activityCreateTime;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    public String getActivityCoverPath() {
        return activityCoverPath;
    }

    public void setActivityCoverPath(String activityCoverPath) {
        this.activityCoverPath = activityCoverPath;
    }

    public int getActivityAuditStatus() {
        return activityAuditStatus;
    }

    public void setActivityAuditStatus(int activityAuditStatus) {
        this.activityAuditStatus = activityAuditStatus;
    }

    public Date getActivityCreateTime() {
        return activityCreateTime;
    }

    public void setActivityCreateTime(Date activityCreateTime) {
        this.activityCreateTime = activityCreateTime;
    }
}
