package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.FormDAO;
import com.practice.webapp.entity.Article;
import com.practice.webapp.entity.Form;
import com.practice.webapp.entity.Statistic;

public class FormDAOImpl implements FormDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public List<Form> getList() {
		// TODO Auto-generated method stub
				List<Form> formList = new ArrayList<Form>();
				String sql = "SELECT * FROM form WHERE Test_ID='1'";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Form form = new Form();
						form.getTest().setTestId(rs.getInt("Test_ID"));
						form.setFormId(rs.getInt("Form_ID"));
						form.setFormName(rs.getString("Form_Name"));
						form.setFormDetail(rs.getString("Form_Detail"));
						form.setFormDownload(rs.getString("Form_Download"));
						formList.add(form);
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
				return formList;
	}
	
	@Override
	public List<Form> getList_SS() {
		// TODO Auto-generated method stub
				List<Form> formList = new ArrayList<Form>();
				String sql = "SELECT * FROM form WHERE Test_ID='2'";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Form form = new Form();
						form.getTest().setTestId(rs.getInt("Test_ID"));
						form.setFormId(rs.getInt("Form_ID"));
						form.setFormName(rs.getString("Form_Name"));
						form.setFormDetail(rs.getString("Form_Detail"));
						form.setFormDownload(rs.getString("Form_Download"));
						formList.add(form);
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
				return formList;
	}
	
	@Override
	public List<Form> getList_EL() {
		// TODO Auto-generated method stub
				List<Form> formList = new ArrayList<Form>();
				String sql = "SELECT * FROM form WHERE Test_ID='3'";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Form form = new Form();
						form.getTest().setTestId(rs.getInt("Test_ID"));
						form.setFormId(rs.getInt("Form_ID"));
						form.setFormName(rs.getString("Form_Name"));
						form.setFormDetail(rs.getString("Form_Detail"));
						form.setFormDownload(rs.getString("Form_Download"));
						formList.add(form);
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
				return formList;
	}
	
	@Override
	public List<Form> getListDetailDistinct() {
		// TODO Auto-generated method stub
		List<Form> formList = new ArrayList<Form>();
		String sql = "SELECT DISTINCT Form_Detail FROM form WHERE Test_ID='1'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Form form = new Form();

				form.setFormDetail(rs.getString("Form_Detail"));
				formList.add(form);
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
		return formList;
	}

	@Override
	public List<Form> getListDetailDistinct_SS() {
		// TODO Auto-generated method stub
		List<Form> formList = new ArrayList<Form>();
		String sql = "SELECT DISTINCT Form_Detail FROM form WHERE Test_ID='2'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Form form = new Form();

				form.setFormDetail(rs.getString("Form_Detail"));
				formList.add(form);
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
		return formList;
	}
	
	@Override
	public List<Form> getListDetailDistinct_EL() {
		// TODO Auto-generated method stub
		List<Form> formList = new ArrayList<Form>();
		String sql = "SELECT DISTINCT Form_Detail FROM form WHERE Test_ID='3'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Form form = new Form();

				form.setFormDetail(rs.getString("Form_Detail"));
				formList.add(form);
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
		return formList;
	}
	
	@Override
	public List<Form> getDistinctDetail() {
		// TODO Auto-generated method stub
		List<Form> formList = new ArrayList<Form>();
		String sql = "SELECT DISTINCT Form_Detail FROM form";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Form form = new Form();

				form.setFormDetail(rs.getString("Form_Detail"));
				formList.add(form);
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
		return formList;
	}
	
	@Override
	public List<Form> getAllList() {
		// TODO Auto-generated method stub
				List<Form> formList = new ArrayList<Form>();
				String sql = "SELECT * FROM form a "
						+ "JOIN test b ON a.Test_ID = b.Test_ID "
						+ "ORDER BY Form_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Form form = new Form();
						form.getTest().setTestId(rs.getInt("Test_ID"));
						form.getTest().setCategory(rs.getString("Test_Category"));
						form.setFormId(rs.getInt("Form_ID"));
						form.setFormName(rs.getString("Form_Name"));
						form.setFormDetail(rs.getString("Form_Detail"));
						form.setFormDownload(rs.getString("Form_Download"));
						formList.add(form);
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
				return formList;
	}
	
	@Override
	public void insert(Form form) {
		// TODO Auto-generated method stub
		String sql = "INSERT form(Form_Name,Test_ID,Form_Detail,Form_Download) "
				+ "VALUES(?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, form.getFormName());
			smt.setInt(2, form.getTest().getTestId());
			smt.setString(3, form.getFormDetail());
			smt.setString(4, form.getFormDownload());
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
		String sql = "DELETE FROM form WHERE Form_ID = ?";
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
	public void update(Form form) {
		// TODO Auto-generated method stub
		String sql = "UPDATE form SET Test_ID=?, Form_Name=?, Form_Detail=?, Form_Download=?"
				+ "WHERE Form_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, form.getTest().getTestId());
			smt.setString(2, form.getFormName());
			smt.setString(3, form.getFormDetail());
			smt.setString(4, form.getFormDownload());
			smt.setInt(5, form.getFormId());
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
	public Form get(Form form) {
		// TODO Auto-generated method stub
				List<Form> formList = new ArrayList<Form>();
				String sql = "SELECT * FROM form WHERE Form_ID = ? ";
			try {
				conn = dataSource.getConnection();
				smt = conn.prepareStatement(sql);
				smt.setInt(1, form.getFormId());
				rs = smt.executeQuery();
				if(rs.next()){
			//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
					form.getTest().setTestId(rs.getInt("Test_ID"));
					form.setFormId(rs.getInt("Form_ID"));
					form.setFormName(rs.getString("Form_Name"));
					form.setFormDetail(rs.getString("Form_Detail"));
					form.setFormDownload(rs.getString("Form_Download"));
					formList.add(form);
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
			 return form;
	}
	
}