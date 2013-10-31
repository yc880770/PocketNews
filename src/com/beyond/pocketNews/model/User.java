package com.beyond.pocketNews.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    public static final int USER_TYPE_SUPER_ADMIN = 1;
	public static final int USER_TYPE_ADMIN=2;
	public static final int USER_TYPE_TEACHER=3;
	public static final int USER_TYPE_STUDENT=4;
	public static final int USER_GENDER_MALE=1;
	public static final int USER_GENDER_FEMALE=2;
	
	private int userId;
	private String userName;
	private String userPassword;
	private int userType;
	private Date userCreateTime;
	private int userGender;
	private String userDesc;
	private int userStatus;
	private List<Log> logs=new ArrayList<Log>();
	private List<Role> roles=new ArrayList<Role>();
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
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public Date getUserCreateTime() {
		return userCreateTime;
	}
	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}
	public int getUserGender() {
		return userGender;
	}
	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}
	public String getUserDesc() {
		return userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public List<Log> getLogs() {
		return logs;
	}
	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}

	
}
