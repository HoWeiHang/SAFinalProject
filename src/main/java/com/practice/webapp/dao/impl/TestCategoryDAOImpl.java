package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.entity.Question;
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
				testCategory.setTestId(rs.getInt("Test_ID"));
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

	@Override
	public void insert(Test test) {
		// TODO Auto-generated method stub
		String sql = "INSERT test(Test_Category,Test_Introduction,Test_Brochure) "
				+ "VALUES(?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, test.getCategory());
			smt.setString(2, test.getIntroduction());
			smt.setString(3, test.getBrochure());
			smt.executeUpdate();			
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
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM test WHERE Test_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, id);
			smt.executeUpdate();			
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
		
	}

	@Override
	public void update(Test test) {
		// TODO Auto-generated method stub
				String sql = "UPDATE test SET Test_Category=?, Test_Introduction=?, Test_Brochure=?"
						+ "WHERE Test_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setString(1, test.getCategory());
					smt.setString(2, test.getIntroduction());
					smt.setString(3, test.getBrochure());
					smt.setInt(4, test.getTestId());
					smt.executeUpdate();			
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
	}

	@Override
	public Test get(Test test) {
		// TODO Auto-generated method stub
		List<Test> testList = new ArrayList<Test>();
		String sql = "SELECT * FROM test WHERE Test_ID = ? ";
	try {
		conn = dataSource.getConnection();
		smt = conn.prepareStatement(sql);
		smt.setInt(1, test.getTestId());
		rs = smt.executeQuery();
		if(rs.next()){
	//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
			test.setTestId(rs.getInt("Test_ID"));
			test.setCategory(rs.getString("Test_Category"));
			test.setIntroduction(rs.getString("Test_Introduction"));
			test.setBrochure(rs.getString("Test_Brochure"));
			testList.add(test);
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
	 return test;
	}
	
}
