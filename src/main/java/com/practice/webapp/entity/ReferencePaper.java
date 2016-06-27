package com.practice.webapp.entity;

import java.util.Date;

public class ReferencePaper{
	private int referencePaperId;
	private String referencePaperName;
	private String referencePaperYear;
	private String referencePaperDownload;
	private Test test=new Test();
	public int getReferencePaperId() {
		return referencePaperId;
	}
	public void setReferencePaperId(int referencePaperId) {
		this.referencePaperId = referencePaperId;
	}
	public String getReferencePaperName() {
		return referencePaperName;
	}
	public void setReferencePaperName(String referencePaperName) {
		this.referencePaperName = referencePaperName;
	}
	public String getReferencePaperYear() {
		return referencePaperYear;
	}
	public void setReferencePaperYear(String referencePaperYear) {
		this.referencePaperYear = referencePaperYear;
	}
	public String getReferencePaperDownload() {
		return referencePaperDownload;
	}
	public void setReferencePaperDownload(String referencePaperDownload) {
		this.referencePaperDownload = referencePaperDownload;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
}