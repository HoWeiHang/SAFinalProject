package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.ReferencePaper;

public interface ReferencePaperDAO {
	public List<ReferencePaper> getList_EL();
	public List<ReferencePaper> getDistinctName();
	public List<ReferencePaper> getDistinctYear();
	public void insert(ReferencePaper referencePaper);
	public void delete(String id);
	public void update(ReferencePaper referencePaper);
	public ReferencePaper get(ReferencePaper referencePaper);
}
