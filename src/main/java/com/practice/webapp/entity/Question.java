package com.practice.webapp.entity;

import java.util.Date;

public class Question{
	private int questionId;
	private String questionName;
	private String questionContent;
	private String questionDetail;
	private Test test=new Test();
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionDetail() {
		return questionDetail;
	}
	public void setQuestionDetail(String questionDetail) {
		this.questionDetail = questionDetail;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}