package com.practice.webapp.entity;

import java.util.Date;

public class PastPaper{
	private int pastPaperId;
	private int pastPaperYear;
	private String pastPaperSubject;
	private String pastPaperPDF;
	private String pastPaperWORD;
	private String pastPaperAnswer;
	private String pastPaperScore;
	private String pastPaperVoice;
	private String pastPaperVTable;
	private Test test=new Test();
	public int getPastPaperId() {
		return pastPaperId;
	}
	public void setPastPaperId(int pastPaperId) {
		this.pastPaperId = pastPaperId;
	}
	public int getPastPaperYear() {
		return pastPaperYear;
	}
	public void setPastPaperYear(int pastPaperYear) {
		this.pastPaperYear = pastPaperYear;
	}
	public String getPastPaperSubject() {
		return pastPaperSubject;
	}
	public void setPastPaperSubject(String pastPaperSubject) {
		this.pastPaperSubject = pastPaperSubject;
	}
	public String getPastPaperPDF() {
		return pastPaperPDF;
	}
	public void setPastPaperPDF(String pastPaperPDF) {
		this.pastPaperPDF = pastPaperPDF;
	}
	public String getPastPaperWORD() {
		return pastPaperWORD;
	}
	public void setPastPaperWORD(String pastPaperWORD) {
		this.pastPaperWORD = pastPaperWORD;
	}
	public String getPastPaperAnswer() {
		return pastPaperAnswer;
	}
	public void setPastPaperAnswer(String pastPaperAnswer) {
		this.pastPaperAnswer = pastPaperAnswer;
	}
	public String getPastPaperScore() {
		return pastPaperScore;
	}
	public void setPastPaperScore(String pastPaperScore) {
		this.pastPaperScore = pastPaperScore;
	}
	public String getPastPaperVoice() {
		return pastPaperVoice;
	}
	public void setPastPaperVoice(String pastPaperVoice) {
		this.pastPaperVoice = pastPaperVoice;
	}
	public String getPastPaperVTable() {
		return pastPaperVTable;
	}
	public void setPastPaperVTable(String pastPaperVTable) {
		this.pastPaperVTable = pastPaperVTable;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}