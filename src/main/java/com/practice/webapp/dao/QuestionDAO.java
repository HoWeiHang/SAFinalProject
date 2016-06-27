package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Question;

public interface QuestionDAO {
	public List<Question> getList_FirstDetail();
	public List<Question> getList_SecondDetail();
	public List<Question> getList_ThirdDetail();
	public List<Question> getList_FourthDetail();
	public List<Question> getList_FifthDetail();
	public List<Question> getAllList();
	public List<Question> getDistinctDetail();
	public void insert(Question question);
	public void delete(String id);
	public void update(Question question);
	public Question get(Question question);
}
