package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.News;

public interface NewsDAO {	
	
	public void insert(News news);
	public void delete(News news);
	public void update(News news);
	public List<News> getList();
	public News get(News news);
	

}
