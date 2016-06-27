package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Test;

public interface TestCategoryDAO {
	public List<Test> getList();
	public void insert(Test test);
	public void delete(String id);
	public void update(Test test);
	public Test get(Test test);
}