package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.PastPaper;

public interface PastPaperDAO {	
	
	public void insert(PastPaper pastPaper);
	public void delete(PastPaper pastPaper);
	public void update(PastPaper pastPaper);
	public List<PastPaper> getList();
	public PastPaper get(PastPaper pastPaper);
	

}