package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Product;


public interface ProductDAO {	
	
	public void insert(Product aProduct);
	public void delete(Product aProduct);
	public void update(Product aProduct);
	public List<Product> getList();
	public List<Product> getReorderList();
	public List<Product> getAvailableList();
	public Product get(Product aProduct);
	

}
