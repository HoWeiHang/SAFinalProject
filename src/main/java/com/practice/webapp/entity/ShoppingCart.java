package com.practice.webapp.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Integer> productList = new ArrayList<Integer>();

	public List<Integer> getCart(){
		return productList;
	}
	public void add(int aProduct){
		productList.add(aProduct);
	}
	public int count(){
		return productList.size();
	}

}
