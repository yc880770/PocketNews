package com.beyond.pocketNews.model.entity;

/**
 * Created with IntelliJ IDEA.
 * User: 闯儿
 * Date: 13-11-1
 * Time: 上午10:30
 * To change this template use File | Settings | File Templates.
 */
public class User  {
    private int  userId;
    private int  userStatus;
    private String userName;
    private String userPassword;
    private int  userRoleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }
}
