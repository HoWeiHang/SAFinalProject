package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.dao.StatisticDAO;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.ReferencePaper;
//import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.Statistic;

public class StatisticDAOImpl implements StatisticDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void insert(Statistic statistic) {
		// TODO Auto-generated method stub
		String sql = "INSERT statistic(Statistic_Name,Test_ID,Statistic_Year,Statistic_Region,Statistic_Download) "
				+ "VALUES(?,?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, statistic.getStatisticName());
			smt.setInt(2, statistic.getTest().getTestId());
			smt.setString(3, statistic.getStatisticYear());
			smt.setString(4, statistic.getStatisticRegion());
			smt.setString(5, statistic.getStatisticDownload());
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
		String sql = "DELETE FROM statistic WHERE Statistic_ID = ?";
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
	public void update(Statistic statistic) {
		// TODO Auto-generated method stub
				String sql = "UPDATE statistic SET Test_ID=?, Statistic_Name=?, Statistic_Year=?, Statistic_Region=?, Statistic_Download=?"
						+ "WHERE Statistic_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, statistic.getTest().getTestId());
					smt.setString(2, statistic.getStatisticName());
					smt.setString(3, statistic.getStatisticYear());
					smt.setString(4, statistic.getStatisticRegion());
					smt.setString(5, statistic.getStatisticDownload());
					smt.setInt(6, statistic.getStatisticId());
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
	public List<Statistic> getData(String year,String region,String name,String TestID) {
		// TODO Auto-generated method stub
		List<Statistic> statisticList = new ArrayList<Statistic>();
		
		String sql = "SELECT * FROM statistic a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "WHERE Statistic_Year ='"+ year +"' AND Statistic_Region ='"+ region +"' AND Statistic_Name ='"+ name +"'AND a.Test_ID = '" + TestID +"'";
//				+ "ORDER BY News_ID DESC";
		if(year.equals("all") && TestID.equals("測驗項目") && region.equals("請選擇專區分類") && name.equals("請選擇左方分類")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID ";
		}
		if(year.equals("all") && region.equals("請選擇專區分類") && name.equals("請選擇左方分類")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ " WHERE a.Test_ID = '"+ TestID +"'";
		}
		else if(TestID.equals("測驗項目") && region.equals("請選擇專區分類") && name.equals("請選擇左方分類")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "WHERE Statistic_Year ='"+ year +"'";
		}
		else if(year.equals("all") && TestID.equals("測驗項目") && name.equals("請選擇左方分類")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "WHERE Statistic_Region ='"+ region +"' ";
		}
		else if(region.equals("請選擇專區分類") && name.equals("請選擇左方分類")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "WHERE Statistic_Year ='"+ year +"' AND a.Test_ID = '" + TestID +"'";
		}
		else if(TestID.equals("測驗項目") && year.equals("all")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "WHERE Statistic_Region ='"+ region +"' AND Statistic_Name ='"+ name +"'";
		}
		else if(year.equals("all")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ " WHERE Statistic_Region ='"+ region +"' AND Statistic_Name ='"+ name +"'AND a.Test_ID = '"+ TestID +"'";
		}
		else if(TestID.equals("測驗項目")){
			sql = "SELECT * FROM statistic a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "WHERE Statistic_Year ='"+ year +"' AND Statistic_Region ='"+ region +"' AND Statistic_Name ='"+ name +"'";
		}
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();
				statistic.getTest().setTestId(rs.getInt("Test_ID"));
				statistic.getTest().setCategory(rs.getString("Test_Category"));
				statistic.setStatisticId(rs.getInt("Statistic_ID"));
				statistic.setStatisticName(rs.getString("Statistic_Name"));
				statistic.setStatisticYear(rs.getString("Statistic_Year"));
				statistic.setStatisticRegion(rs.getString("Statistic_Region"));
				statistic.setStatisticDownload(rs.getString("Statistic_Download"));
				statisticList.add(statistic);
			}
			rs.close();
			smt.close();
			if(statisticList.size() == 0){
				Statistic statistic = new Statistic();
				statistic.setStatisticId(0);
				statisticList.add(statistic);
			}
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return statisticList;
	}

	@Override
	public List<Statistic> getAllList() {
		// TODO Auto-generated method stub
		
		List<Statistic> statisticList = new ArrayList<Statistic>();
		
		String sql = "SELECT * FROM statistic a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "ORDER BY Statistic_ID ASC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();
				statistic.getTest().setTestId(rs.getInt("Test_ID"));
				statistic.getTest().setCategory(rs.getString("Test_Category"));
				statistic.setStatisticId(rs.getInt("Statistic_ID"));
				statistic.setStatisticName(rs.getString("Statistic_Name"));
				statistic.setStatisticYear(rs.getString("Statistic_Year"));
				statistic.setStatisticRegion(rs.getString("Statistic_Region"));
				statistic.setStatisticDownload(rs.getString("Statistic_Download"));
				statisticList.add(statistic);
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
		return statisticList;
	}
	
	@Override
	public Statistic get(Statistic statistic) {
		// TODO Auto-generated method stub
		List<Statistic> statisticPaperList = new ArrayList<Statistic>();
		String sql = "SELECT * FROM statistic WHERE Statistic_ID = ? ";
	try {
		conn = dataSource.getConnection();
		smt = conn.prepareStatement(sql);
		smt.setInt(1, statistic.getStatisticId());
		rs = smt.executeQuery();
		if(rs.next()){
	//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
			statistic.getTest().setTestId(rs.getInt("Test_ID"));
			statistic.setStatisticId(rs.getInt("Statistic_ID"));
			statistic.setStatisticName(rs.getString("Statistic_Name"));
			statistic.setStatisticYear(rs.getString("Statistic_Year"));
			statistic.setStatisticRegion(rs.getString("Statistic_Region"));
			statistic.setStatisticDownload(rs.getString("Statistic_Download"));
			statisticPaperList.add(statistic);
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
	 return statistic;
	}
	
	@Override
	public List<Statistic> getYearList() {
		// TODO Auto-generated method stub
		List<Statistic> statisticList = new ArrayList<Statistic>();
		
		String sql = "SELECT DISTINCT(Statistic_Year) FROM statistic"
     			+ " ORDER BY Statistic_Year ASC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();				
				statistic.setStatisticYear(rs.getString("Statistic_Year"));
				statisticList.add(statistic);
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
		return statisticList;
	}
	
	@Override
	public List<Statistic> getRegionList(String TestID) {
		// TODO Auto-generated method stub
		List<Statistic> statisticList = new ArrayList<Statistic>();
		
		String sql = "SELECT DISTINCT(Statistic_Region) FROM statistic WHERE Test_ID = '"+ TestID +"'";
		
		if(TestID.equals("0")){
			sql = "SELECT DISTINCT(Statistic_Region) FROM statistic ";
		}
		
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();				
				statistic.setStatisticRegion(rs.getString("Statistic_Region"));
				statisticList.add(statistic);
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
		return statisticList;
	}
	
	@Override
	public List<Statistic> getNameList() {
		// TODO Auto-generated method stub
		List<Statistic> statisticList = new ArrayList<Statistic>();
		
		String sql = "SELECT DISTINCT(Statistic_Name) FROM statistic";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();				
				statistic.setStatisticName(rs.getString("Statistic_Name"));
				statisticList.add(statistic);
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
		return statisticList;
	}
	
	@Override
	public List<Statistic> getDistinctRegion(){
		// TODO Auto-generated method stub
		List<Statistic> statisticList = new ArrayList<Statistic>();
		String sql = "SELECT DISTINCT Statistic_Region FROM statistic ";
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Statistic statistic = new Statistic();
				statistic.setStatisticRegion(rs.getString("Statistic_Region"));
				statisticList.add(statistic);
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
		return statisticList;
		
	}
	
	
	
	
	
}
