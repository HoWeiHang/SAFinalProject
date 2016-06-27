package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.Form;

public interface FormDAO {	
	
	public void insert(Form form);
	public void delete(String id);
	public void update(Form form);
	public List<Form> getList();
	public List<Form> getList_SS();
	public List<Form> getList_EL();	
	public List<Form> getListDetailDistinct();
	public List<Form> getListDetailDistinct_SS();
	public List<Form> getListDetailDistinct_EL();
	public List<Form> getAllList();
	public List<Form> getDistinctDetail();
	public Form get(Form form);
	

}