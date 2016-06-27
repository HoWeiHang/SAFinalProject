package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.News;

public interface NewsDAO {	
	
	public void insert(News news);
	public void delete(String id);
	public void update(News news);
	public List<News> getList(String test);
	public List<News> getAllList();
	public List<News> getWordList(String test,String word);
	public List<News> getMonthList(String test,String month,String word);
	public News get(News news);
	

}
