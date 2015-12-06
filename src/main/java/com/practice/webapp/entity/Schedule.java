package com.practice.webapp.entity;

import java.util.Date;

public class Schedule{
	private String scheduleName;
	private String scheduleCategory;	
	private String scheduleContent;
	private Date schedulePostTime;
	private String schedulePeriod;
	private String scheduleUrl;
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getScheduleCategory() {
		return scheduleCategory;
	}
	public void setScheduleCategory(String scheduleCategory) {
		this.scheduleCategory = scheduleCategory;
	}
	public String getScheduleContent() {
		return scheduleContent;
	}
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	public Date getSchedulePostTime() {
		return schedulePostTime;
	}
	public void setSchedulePostTime(Date schedulePostTime) {
		this.schedulePostTime = schedulePostTime;
	}
	public String getSchedulePeriod() {
		return schedulePeriod;
	}
	public void setSchedulePeriod(String schedulePeriod) {
		this.schedulePeriod = schedulePeriod;
	}
	public String getScheduleUrl() {
		return scheduleUrl;
	}
	public void setScheduleUrl(String scheduleUrl) {
		this.scheduleUrl = scheduleUrl;
	}
	
	
	
}