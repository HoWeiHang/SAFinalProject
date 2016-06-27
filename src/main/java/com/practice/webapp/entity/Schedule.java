package com.practice.webapp.entity;

import java.util.Date;

public class Schedule{
	private int scheduleId;
	private String scheduleName;	
	private Date schedulePostTime;
	private String scheduleStartTime;
	private String scheduleEndTime;
	private Test test=new Test();
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public Date getSchedulePostTime() {
		return schedulePostTime;
	}
	public void setSchedulePostTime(Date schedulePostTime) {
		this.schedulePostTime = schedulePostTime;
	}
	public String getScheduleStartTime() {
		return scheduleStartTime;
	}
	public void setScheduleStartTime(String scheduleStartTime) {
		this.scheduleStartTime = scheduleStartTime;
	}
	public String getScheduleEndTime() {
		return scheduleEndTime;
	}
	public void setScheduleEndTime(String scheduleEndTime) {
		this.scheduleEndTime = scheduleEndTime;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
	
}