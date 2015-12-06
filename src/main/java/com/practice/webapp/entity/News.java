package com.practice.webapp.entity;

import java.util.Date;

public class News{
	private int id;
	private String title;
	private String content;
	private String issuePerson;
	private Date createDate;
	private Test test=new Test();
	private Schedule schedule=new Schedule();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIssuePerson() {
		return issuePerson;
	}
	public void setIssuePerson(String issuePerson) {
		this.issuePerson = issuePerson;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
}