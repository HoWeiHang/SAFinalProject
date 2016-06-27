package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.PastPaper;
//import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.Schedule;

public class MasterpieceDAOImpl implements MasterpieceDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Masterpiece masterpiece) {
		// TODO Auto-generated method stub
		String sql = "INSERT masterpiece(Test_ID,Masterpiece_Year,Masterpiece_Subject,Masterpiece_Name,Masterpiece_Contents,Masterpiece_URL) "
				+ "VALUES(?,?,?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, masterpiece.getTest().getTestId());
			smt.setString(2, masterpiece.getMasterpieceYear());
			smt.setString(3, masterpiece.getMasterpieceSubject());
			smt.setString(4, masterpiece.getMasterpieceName());
			smt.setString(5, masterpiece.getMasterpieceContent());
			smt.setString(6, masterpiece.getMasterpieceURL());
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
		String sql = "DELETE FROM masterpiece WHERE Masterpiece_ID = ?";
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
	public void update(Masterpiece masterpiece) {
		// TODO Auto-generated method stub
				String sql = "UPDATE masterpiece SET Test_ID=?, Masterpiece_Year=?, Masterpiece_Subject=?, Masterpiece_Name=?, Masterpiece_Contents=?, Masterpiece_URL=?"
						+ "WHERE Masterpiece_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, masterpiece.getTest().getTestId());
					smt.setString(2, masterpiece.getMasterpieceYear());
					smt.setString(3, masterpiece.getMasterpieceSubject());
					smt.setString(4, masterpiece.getMasterpieceName());
					smt.setString(5, masterpiece.getMasterpieceContent());
					smt.setString(6, masterpiece.getMasterpieceURL());
					smt.setInt(7, masterpiece.getMasterpieceId());
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
	public List<Masterpiece> getListSubject(String subject,String year) {
		// TODO Auto-generated method stub
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		String sql = "SELECT * FROM masterpiece WHERE  Masterpiece_Subject='"+ subject +"' AND Test_ID='1'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Masterpiece masterpiece = new Masterpiece();
				masterpiece.getTest().setTestId(rs.getInt("Test_ID"));
				masterpiece.setMasterpieceId(rs.getInt("Masterpiece_ID"));
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
				masterpiece.setMasterpieceName(rs.getString("Masterpiece_Name"));
				masterpiece.setMasterpieceContent(rs.getString("Masterpiece_Contents"));
				masterpiece.setMasterpieceURL(rs.getString("Masterpiece_URL"));
				masterpieceList.add(masterpiece);
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
		return masterpieceList;
	}

	@Override
	public List<Masterpiece> getListSubject_SS(String subject,String year) {
		// TODO Auto-generated method stub
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		String sql = "SELECT * FROM masterpiece WHERE  Masterpiece_Subject='"+ subject +"' AND Test_ID='2'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Masterpiece masterpiece = new Masterpiece();
				masterpiece.getTest().setTestId(rs.getInt("Test_ID"));
				masterpiece.setMasterpieceId(rs.getInt("Masterpiece_ID"));
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
				masterpiece.setMasterpieceName(rs.getString("Masterpiece_Name"));
				masterpiece.setMasterpieceContent(rs.getString("Masterpiece_Contents"));
				masterpiece.setMasterpieceURL(rs.getString("Masterpiece_URL"));
				masterpieceList.add(masterpiece);
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
		return masterpieceList;
	}
	
	@Override
	public List<Masterpiece> getListForNavBarSubject() {
		// TODO Auto-generated method stub
				List<Masterpiece> pastPaperList = new ArrayList<Masterpiece>();
				String sql = "SELECT DISTINCT Masterpiece_Subject FROM masterpiece WHERE Test_ID='1'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Masterpiece masterpiece = new Masterpiece();
						masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
						pastPaperList.add(masterpiece);
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
				return pastPaperList;
	}
	
	@Override
	public List<Masterpiece> getListForNavBarSubject_SS() {
		// TODO Auto-generated method stub
				List<Masterpiece> pastPaperList = new ArrayList<Masterpiece>();
				String sql = "SELECT DISTINCT Masterpiece_Subject FROM masterpiece WHERE Test_ID='2'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Masterpiece masterpiece = new Masterpiece();
						masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
						pastPaperList.add(masterpiece);
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
				return pastPaperList;
	}
	
	@Override
	public List<Masterpiece> getDistinctList() {
		// TODO Auto-generated method stub
				List<Masterpiece> pastPaperList = new ArrayList<Masterpiece>();
				String sql = "SELECT DISTINCT Masterpiece_Subject FROM masterpiece";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Masterpiece masterpiece = new Masterpiece();
						masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
						pastPaperList.add(masterpiece);
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
				return pastPaperList;
	}
	
	@Override
	public List<Masterpiece> getAllList() {
		// TODO Auto-generated method stub
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		String sql = "SELECT * FROM masterpiece a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "ORDER BY Masterpiece_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Masterpiece masterpiece = new Masterpiece();
				masterpiece.getTest().setTestId(rs.getInt("Test_ID"));
				masterpiece.getTest().setCategory(rs.getString("Test_Category"));
				masterpiece.setMasterpieceId(rs.getInt("Masterpiece_ID"));
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
				masterpiece.setMasterpieceName(rs.getString("Masterpiece_Name"));
				masterpiece.setMasterpieceContent(rs.getString("Masterpiece_Contents"));
				masterpiece.setMasterpieceURL(rs.getString("Masterpiece_URL"));
				masterpieceList.add(masterpiece);
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
		return masterpieceList;
	}	

	@Override
	public Masterpiece get(Masterpiece masterpiece) {
		// TODO Auto-generated method stub
			List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
			String sql = "SELECT * FROM masterpiece WHERE Masterpiece_ID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, masterpiece.getMasterpieceId());
			rs = smt.executeQuery();
			if(rs.next()){
		//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
				masterpiece.getTest().setTestId(rs.getInt("Test_ID"));
				masterpiece.setMasterpieceId(rs.getInt("Masterpiece_ID"));
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpiece.setMasterpieceSubject(rs.getString("Masterpiece_Subject"));
				masterpiece.setMasterpieceName(rs.getString("Masterpiece_Name"));
				masterpiece.setMasterpieceContent(rs.getString("Masterpiece_Contents"));
				masterpiece.setMasterpieceURL(rs.getString("Masterpiece_URL"));
				masterpieceList.add(masterpiece);
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
		 return masterpiece;
	 }
	
	
	public List<Masterpiece> getListYear() {
		// TODO Auto-generated method stub
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		String sql = "SELECT DISTINCT(Masterpiece_Year) FROM masterpiece WHERE Test_ID='1'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Masterpiece masterpiece = new Masterpiece();			
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpieceList.add(masterpiece);
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
		return masterpieceList;
	}
	
	public List<Masterpiece> getListYear_SS() {
		// TODO Auto-generated method stub
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		String sql = "SELECT DISTINCT(Masterpiece_Year) FROM masterpiece WHERE Test_ID='2'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Masterpiece masterpiece = new Masterpiece();			
				masterpiece.setMasterpieceYear(rs.getString("Masterpiece_Year"));
				masterpieceList.add(masterpiece);
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
		return masterpieceList;
	}
}

