package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.PastPaper;
//import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.ReferencePaper;

public class PastPaperDAOImpl implements PastPaperDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(PastPaper pastPaper) {
		// TODO Auto-generated method stub
				String sql = "INSERT past_paper(Test_ID,Past_Paper_Subject,Past_Paper_Year,Past_Paper_PDF,Past_Paper_WORD,"
						+ "Past_Paper_Answer,Past_Paper_Score,Past_Paper_Voice,Past_Paper_Vtable) "
						+ "VALUES(?,?,?,?,?,?,?,?,?)";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, pastPaper.getTest().getTestId());
					smt.setString(2, pastPaper.getPastPaperSubject());
					smt.setString(3, pastPaper.getPastPaperYear());
					smt.setString(4, pastPaper.getPastPaperPDF());
					smt.setString(5, pastPaper.getPastPaperWORD());
					smt.setString(6, pastPaper.getPastPaperAnswer());
					smt.setString(7, pastPaper.getPastPaperScore());
					smt.setString(8, pastPaper.getPastPaperVoice());
					smt.setString(9, pastPaper.getPastPaperVTable());
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
		String sql = "DELETE FROM past_paper WHERE Past_Paper_ID = ?";
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
	public void update(PastPaper pastPaper) {
		// TODO Auto-generated method stub
		String sql = "UPDATE past_paper SET Test_ID=?, Past_Paper_Subject=?, Past_Paper_Year=?, Past_Paper_PDF=?, Past_Paper_WORD=?, Past_Paper_Answer=?,"
				+ "Past_Paper_Score=?,Past_Paper_Voice=?,Past_Paper_Vtable=?"
				+ "WHERE Past_Paper_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, pastPaper.getTest().getTestId());
			smt.setString(2, pastPaper.getPastPaperSubject());
			smt.setString(3, pastPaper.getPastPaperYear());
			smt.setString(4, pastPaper.getPastPaperPDF());
			smt.setString(5, pastPaper.getPastPaperWORD());
			smt.setString(6, pastPaper.getPastPaperAnswer());
			smt.setString(7, pastPaper.getPastPaperScore());
			smt.setString(8, pastPaper.getPastPaperVoice());
			smt.setString(9, pastPaper.getPastPaperVTable());
			smt.setInt(10, pastPaper.getPastPaperId());
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
	public List<PastPaper> getListSubject(String subject) {
		// TODO Auto-generated method stub
				List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
				String sql = "SELECT * FROM past_paper WHERE  Past_Paper_Subject='"+ subject +"' AND Test_ID='1'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						PastPaper pastPaper = new PastPaper();
						pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
						pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
						pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
						pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
						pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
						pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
						pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
						pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
						pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
						pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
						pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListSubject_SS(String subject) {
		// TODO Auto-generated method stub
				List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
				String sql = "SELECT * FROM past_paper WHERE  Past_Paper_Subject='"+ subject +"' AND Test_ID='2'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						PastPaper pastPaper = new PastPaper();
						pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
						pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
						pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
						pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
						pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
						pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
						pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
						pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
						pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
						pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
						pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListYear(String year) {
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper WHERE  Past_Paper_Year='"+ year +"' AND Test_ID='1'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
				pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
				pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
				pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
				pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
				pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
				pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
				pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListYear_SS(String year) {
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper WHERE  Past_Paper_Year='"+ year +"' AND Test_ID='2'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
				pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
				pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
				pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
				pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
				pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
				pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
				pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListForNavBarSubject(){
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT DISTINCT Past_Paper_Subject FROM past_paper WHERE Test_ID='1'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListForNavBarSubject_SS(){
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT DISTINCT Past_Paper_Subject FROM past_paper WHERE Test_ID='2'";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getDistinctSubject(){
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT DISTINCT Past_Paper_Subject FROM past_paper ";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListForNavBarYear() {
		// TODO Auto-generated method stub
				List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
				String sql = "SELECT DISTINCT Past_Paper_Year FROM past_paper WHERE Test_ID='1'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						PastPaper pastPaper = new PastPaper();
						pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
						pastPaperList.add(pastPaper);
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
	public List<PastPaper> getListForNavBarYear_SS() {
		// TODO Auto-generated method stub
				List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
				String sql = "SELECT DISTINCT Past_Paper_Year FROM past_paper WHERE Test_ID='2'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						PastPaper pastPaper = new PastPaper();
						pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
						pastPaperList.add(pastPaper);
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
	public List<PastPaper> getAllList() {
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "ORDER BY Past_Paper_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
				pastPaper.getTest().setCategory(rs.getString("Test_Category"));
				pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
				pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
				pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
				pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
				pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
				pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
				pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
				pastPaperList.add(pastPaper);
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
	public List<PastPaper> getList_EL() {
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper WHERE Test_ID='3'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
				pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
				pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
				pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
				pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
				pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
				pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
				pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
				pastPaperList.add(pastPaper);
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
	public PastPaper get(PastPaper pastPaper) {
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper WHERE Past_Paper_ID = ? ";
	try {
		conn = dataSource.getConnection();
		smt = conn.prepareStatement(sql);
		smt.setInt(1, pastPaper.getPastPaperId());
		rs = smt.executeQuery();
		if(rs.next()){
	//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
			pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
			pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
			pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
			pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
			pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
			pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
			pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
			pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
			pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
			pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
			pastPaperList.add(pastPaper);
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
	 return pastPaper;
	}

	@Override
	public List<PastPaper> getSearchList(String year){
		// TODO Auto-generated method stub
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		String sql = "SELECT * FROM past_paper a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+"WHERE Past_Paper_Year='"+ year +"' "
				+ "ORDER BY Past_Paper_ID DESC";
		if(year.equals("all")){
			sql = "SELECT * FROM past_paper a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "ORDER BY Past_Paper_ID DESC";
		}
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				PastPaper pastPaper = new PastPaper();
				pastPaper.getTest().setTestId(rs.getInt("Test_ID"));
				pastPaper.getTest().setCategory(rs.getString("Test_Category"));
				pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
				pastPaper.setPastPaperYear(rs.getString("Past_Paper_Year"));
				pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
				pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
				pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
				pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
				pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
				pastPaper.setPastPaperVoice(rs.getString("Past_Paper_Voice"));
				pastPaper.setPastPaperVTable(rs.getString("Past_Paper_Vtable"));
				pastPaperList.add(pastPaper);
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
	
}