package com.practice.webapp.entity;

import java.util.Date;

public class Form{
	private int formId;
	private String formName;
	private String formDetail;
	private String formDownload;
	private Test test=new Test();
	public int getFormId() {
		return formId;
	}
	public void setFormId(int formId) {
		this.formId = formId;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getFormDetail() {
		return formDetail;
	}
	public void setFormDetail(String formDetail) {
		this.formDetail = formDetail;
	}
	public String getFormDownload() {
		return formDownload;
	}
	public void setFormDownload(String formDownload) {
		this.formDownload = formDownload;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}