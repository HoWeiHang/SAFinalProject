package com.practice.webapp.entity;

import java.util.Date;

public class Statistic{
	private int statisticId;
	private String statisticName;
	private String statisticYear;
	private String statisticRegion;
	private String statisticDownload;
	private Test test=new Test();
	public int getStatisticId() {
		return statisticId;
	}
	public void setStatisticId(int statisticId) {
		this.statisticId = statisticId;
	}
	public String getStatisticName() {
		return statisticName;
	}
	public void setStatisticName(String statisticName) {
		this.statisticName = statisticName;
	}
	public String getStatisticYear() {
		return statisticYear;
	}
	public void setStatisticYear(String statisticYear) {
		this.statisticYear = statisticYear;
	}
	public String getStatisticRegion() {
		return statisticRegion;
	}
	public void setStatisticRegion(String statisticRegion) {
		this.statisticRegion = statisticRegion;
	}
	public String getStatisticDownload() {
		return statisticDownload;
	}
	public void setStatisticDownload(String statisticDownload) {
		this.statisticDownload = statisticDownload;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}