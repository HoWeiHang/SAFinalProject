package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.entity.Test;

public class TestCategoryDAOImpl implements TestCategoryDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Test> getList() {
		// TODO Auto-generated method stub
		List<Test> testCategoryList = new ArrayList<Test>();
		String sql = "SELECT * FROM test";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Test testCategory = new Test();
				testCategory.setCategory(rs.getString("Test_Category"));
				testCategory.setIntroduction(rs.getString("Test_Introduction"));
				testCategory.setBrochure(rs.getString("Test_Brochure"));
				testCategoryList.add(testCategory);
			}
			rs.close();
			smt.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return testCategoryList;
	}
	
}
