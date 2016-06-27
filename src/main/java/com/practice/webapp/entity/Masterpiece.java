package com.practice.webapp.entity;

import java.util.Date;

public class Masterpiece{
	private int masterpieceId;
	private String masterpieceYear;
	private String masterpieceSubject;
	private String masterpieceName;
	private String masterpieceContent;
	private String masterpieceURL;
	private Test test=new Test();
	public int getMasterpieceId() {
		return masterpieceId;
	}
	public void setMasterpieceId(int masterpieceId) {
		this.masterpieceId = masterpieceId;
	}
	public String getMasterpieceYear() {
		return masterpieceYear;
	}
	public void setMasterpieceYear(String masterpieceYear) {
		this.masterpieceYear = masterpieceYear;
	}
	public String getMasterpieceSubject() {
		return masterpieceSubject;
	}
	public void setMasterpieceSubject(String masterpieceSubject) {
		this.masterpieceSubject = masterpieceSubject;
	}
	public String getMasterpieceName() {
		return masterpieceName;
	}
	public void setMasterpieceName(String masterpieceName) {
		this.masterpieceName = masterpieceName;
	}
	public String getMasterpieceContent() {
		return masterpieceContent;
	}
	public void setMasterpieceContent(String masterpieceContent) {
		this.masterpieceContent = masterpieceContent;
	}
	public String getMasterpieceURL() {
		return masterpieceURL;
	}
	public void setMasterpieceURL(String masterpieceURL) {
		this.masterpieceURL = masterpieceURL;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}