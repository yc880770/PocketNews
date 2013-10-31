package com.beyond.pocketNews.model;

import java.util.Date;

public class Log {
	private long logId;
	private String logOperate;
	private User user;
	private Date logTime;
	public Date getLogTime() {
		return logTime;
	}
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
	public long getLogId() {
		return logId;
	}
	public void setLogId(long logId) {
		this.logId = logId;
	}
	public String getLogOperate() {
		return logOperate;
	}
	public void setLogOperate(String logOperate) {
		this.logOperate = logOperate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
