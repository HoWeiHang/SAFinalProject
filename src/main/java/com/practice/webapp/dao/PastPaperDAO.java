package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.PastPaper;

public interface PastPaperDAO {	
	
	public void insert(PastPaper pastPaper);
	public void delete(String id);
	public void update(PastPaper pastPaper);
	public List<PastPaper> getListSubject(String subject);
	public List<PastPaper> getListSubject_SS(String subject);
	public List<PastPaper> getListYear(String year);
	public List<PastPaper> getListYear_SS(String year);
	public List<PastPaper> getListForNavBarSubject();
	public List<PastPaper> getListForNavBarSubject_SS();
	public List<PastPaper> getListForNavBarYear();
	public List<PastPaper> getListForNavBarYear_SS();
	public List<PastPaper> getList_EL();
	public List<PastPaper> getAllList();
	public List<PastPaper> getDistinctSubject();
	public List<PastPaper> getSearchList(String year);
	public PastPaper get(PastPaper pastPaper);
	

}