package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.Masterpiece;

public interface MasterpieceDAO {	
	
	public void insert(Masterpiece masterpiece);
	public void delete(String id);
	public void update(Masterpiece masterpiece);
	public List<Masterpiece> getListSubject(String subject,String year);
	public List<Masterpiece> getListSubject_SS(String subject,String year);
	public List<Masterpiece> getListForNavBarSubject();
	public List<Masterpiece> getListForNavBarSubject_SS();
	public List<Masterpiece> getDistinctList();
	public List<Masterpiece> getAllList();
	public Masterpiece get(Masterpiece masterpiece);
	public List<Masterpiece> getListYear();
	public List<Masterpiece> getListYear_SS();

}