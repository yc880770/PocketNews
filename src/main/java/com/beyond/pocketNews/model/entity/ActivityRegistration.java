package com.beyond.pocketNews.model.entity;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-2
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
public class ActivityRegistration {
    private int activityRegId;
    private String activityRegName;
    private String activityRegPhone;
    private int activityRegGender;
    private Date activityRegCreateTime;

    public int getActivityRegId() {
        return activityRegId;
    }

    public void setActivityRegId(int activityRegId) {
        this.activityRegId = activityRegId;
    }

    public String getActivityRegName() {
        return activityRegName;
    }

    public void setActivityRegName(String activityRegName) {
        this.activityRegName = activityRegName;
    }

    public String getActivityRegPhone() {
        return activityRegPhone;
    }

    public void setActivityRegPhone(String activityRegPhone) {
        this.activityRegPhone = activityRegPhone;
    }

    public int getActivityRegGender() {
        return activityRegGender;
    }

    public void setActivityRegGender(int activityRegGender) {
        this.activityRegGender = activityRegGender;
    }

    public Date getActivityRegCreateTime() {
        return activityRegCreateTime;
    }

    public void setActivityRegCreateTime(Date activityRegCreateTime) {
        this.activityRegCreateTime = activityRegCreateTime;
    }
}
