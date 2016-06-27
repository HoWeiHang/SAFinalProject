package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.ReferencePaperDAO;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.Question;
import com.practice.webapp.entity.ReferencePaper;
import com.practice.webapp.entity.Schedule;

public class ReferencePaperDAOImpl implements ReferencePaperDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<ReferencePaper> getList_EL() {
		// TODO Auto-generated method stub
		List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
		String sql = "SELECT * FROM reference_paper a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "ORDER BY Reference_Paper_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				ReferencePaper referencePaper = new ReferencePaper();
				referencePaper.getTest().setTestId(rs.getInt("Test_ID"));
				referencePaper.getTest().setCategory(rs.getString("Test_Category"));
				referencePaper.setReferencePaperId(rs.getInt("Reference_Paper_ID"));
				referencePaper.setReferencePaperName(rs.getString("Reference_Paper_Name"));
				referencePaper.setReferencePaperYear(rs.getString("Reference_Paper_Year"));
				referencePaper.setReferencePaperDownload(rs.getString("Reference_Paper_Download"));
				referencePaperList.add(referencePaper);
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
		return referencePaperList;
	}
	
	@Override
	public List<ReferencePaper> getDistinctName() {
		// TODO Auto-generated method stub
				List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
				String sql = "SELECT DISTINCT Reference_Paper_Name FROM reference_paper";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						ReferencePaper referencePaper = new ReferencePaper();
						referencePaper.setReferencePaperName(rs.getString("Reference_Paper_Name"));
						referencePaperList.add(referencePaper);
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
				return referencePaperList;
	}
	
	@Override
	public List<ReferencePaper> getDistinctYear() {
		// TODO Auto-generated method stub
				List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
				String sql = "SELECT DISTINCT Reference_Paper_Year FROM reference_paper";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						ReferencePaper referencePaper = new ReferencePaper();
						referencePaper.setReferencePaperYear(rs.getString("Reference_Paper_Year"));
						referencePaperList.add(referencePaper);
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
				return referencePaperList;
	}

	@Override
	public void insert(ReferencePaper referencePaper) {
		// TODO Auto-generated method stub
				String sql = "INSERT reference_paper(Test_ID,Reference_Paper_Name,Reference_Paper_Year,Reference_Paper_Download) "
						+ "VALUES(?,?,?,?)";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, referencePaper.getTest().getTestId());
					smt.setString(2, referencePaper.getReferencePaperName());
					smt.setString(3, referencePaper.getReferencePaperYear());
					smt.setString(4, referencePaper.getReferencePaperDownload());
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
				String sql = "DELETE FROM reference_paper WHERE Reference_Paper_ID = ?";
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
	public void update(ReferencePaper referencePaper) {
		// TODO Auto-generated method stub
		String sql = "UPDATE reference_paper SET Test_ID=?, Reference_Paper_Name=?, Reference_Paper_Year=?, Reference_Paper_Download=?"
				+ "WHERE Reference_Paper_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, referencePaper.getTest().getTestId());
			smt.setString(2, referencePaper.getReferencePaperName());
			smt.setString(3, referencePaper.getReferencePaperYear());
			smt.setString(4, referencePaper.getReferencePaperDownload());
			smt.setInt(5, referencePaper.getReferencePaperId());
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
	public ReferencePaper get(ReferencePaper referencePaper) {
		// TODO Auto-generated method stub
					List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
					String sql = "SELECT * FROM reference_paper WHERE Reference_Paper_ID = ? ";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, referencePaper.getReferencePaperId());
					rs = smt.executeQuery();
					if(rs.next()){
				//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
						referencePaper.getTest().setTestId(rs.getInt("Test_ID"));
						referencePaper.setReferencePaperId(rs.getInt("Reference_Paper_ID"));
						referencePaper.setReferencePaperName(rs.getString("Reference_Paper_Name"));
						referencePaper.setReferencePaperYear(rs.getString("Reference_Paper_Year"));
						referencePaper.setReferencePaperDownload(rs.getString("Reference_Paper_Download"));
						referencePaperList.add(referencePaper);
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
				 return referencePaper;
	}
}