package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

//import com.mysql.jdbc.Statement;
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.entity.News;
//import com.practice.webapp.entity.ArticleCategory;

public class NewsDAOImpl implements NewsDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(News news) {
		// TODO Auto-generated method stub
		String sql = "INSERT news(Test_ID,Schedule_ID,News_Title,News_Date,News_Contents,Manager_Account) "
				+ "VALUES(?,?,?,NOW(),?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, news.getTest().getTestId());
			smt.setInt(2, news.getSchedule().getScheduleId());
			smt.setString(3, news.getTitle());
			smt.setString(4, news.getContent());
			smt.setString(5, news.getManager().getManagerAccount());
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
				String sql = "DELETE FROM news WHERE News_ID = ?";
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
	public void update(News news) {
		// TODO Auto-generated method stub
				String sql = "UPDATE news SET Test_ID=?, News_Title=?, News_Contents=?, Manager_Account=?, Schedule_ID=?, News_Date=NOW() "
						+ "WHERE News_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, news.getTest().getTestId());
					smt.setString(2, news.getTitle());
					smt.setString(3, news.getContent());
					smt.setString(4, news.getManager().getManagerAccount());
					smt.setInt(5, news.getSchedule().getScheduleId());
					smt.setInt(6, news.getId());
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
	public List<News> getList(String test) {
		// TODO Auto-generated method stub
		List<News> newsList = new ArrayList<News>();
		String sql = "SELECT * FROM news a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "JOIN  schedule  c ON a.Schedule_ID = c.Schedule_ID "
				+ "WHERE a.Test_ID='"+test+"' "
				+ "ORDER BY News_Date DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				News news = new News();
				news.getTest().setTestId(rs.getInt("Test_ID"));
				news.getTest().setCategory(rs.getString("Test_Category"));
				news.getSchedule().setScheduleId(rs.getInt("Schedule_ID"));
				news.getSchedule().setScheduleName(rs.getString("Schedule_Name"));
				news.setId(rs.getInt("News_ID"));
				news.setTitle(rs.getString("News_Title"));
				news.setContent(rs.getString("News_Contents"));
				news.getManager().setManagerAccount(rs.getString("Manager_Account"));
				news.setCreateDate(rs.getDate("News_Date"));
				newsList.add(news);
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
		return newsList;
	}
	
	@Override
	public List<News> getAllList() {
		// TODO Auto-generated method stub
		List<News> newsList = new ArrayList<News>();
		String sql = "SELECT * FROM news a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "JOIN  schedule  c ON a.Schedule_ID = c.Schedule_ID "
				+ "ORDER BY News_Date DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				News news = new News();
				news.getTest().setTestId(rs.getInt("Test_ID"));
				news.getTest().setCategory(rs.getString("Test_Category"));
				news.getSchedule().setScheduleName(rs.getString("Schedule_Name"));
				news.setId(rs.getInt("News_ID"));
				news.setTitle(rs.getString("News_Title"));
				news.setContent(rs.getString("News_Contents"));
				news.getManager().setManagerAccount(rs.getString("Manager_Account"));
				news.getSchedule().setScheduleId(rs.getInt("Schedule_ID"));
				news.setCreateDate(rs.getDate("News_Date"));
				newsList.add(news);
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
		return newsList;
	}
	
	@Override
	public News get(News news) {
		// TODO Auto-generated method stub
				List<News> newsList = new ArrayList<News>();
				String sql = "SELECT * FROM news WHERE News_ID = ?  ";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, news.getId());
					rs = smt.executeQuery();
					if(rs.next()){
				//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
						news.getTest().setTestId(rs.getInt("Test_ID"));
						news.setId(rs.getInt("News_ID"));
						news.setTitle(rs.getString("News_Title"));
						news.setContent(rs.getString("News_Contents"));
						news.getManager().setManagerAccount(rs.getString("Manager_Account"));
						news.getSchedule().setScheduleId(rs.getInt("Schedule_ID"));
						news.setCreateDate(rs.getDate("News_Date"));
						newsList.add(news);
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
				return news;
	}
	
	public List<News> getWordList(String test,String word) {
		// TODO Auto-generated method stub
		List<News> newsList = new ArrayList<News>();
		
		if(test.equals("學測")){
			test = "1";
		}
		else if(test.equals("指考")){
			test = "2";
		}
		else if(test.equals("英聽")){
			test = "3";
		}
		else if(test.equals("其他")){
			test = "4";
		}
		String sql = "SELECT * FROM news a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "JOIN  schedule c ON a.Schedule_ID = c.Schedule_ID "
				+ "WHERE a.News_Title LIKE '%"+ word +"%' AND a.Test_ID = '"+ test +"' "
				+ "ORDER BY a.News_Date DESC";
		if(test.equals("測驗項目")){
			  sql = "SELECT * FROM news a "
					+ "JOIN test b ON a.Test_ID = b.Test_ID "
					+ "JOIN  schedule c ON a.Schedule_ID = c.Schedule_ID "
					+ "WHERE a.News_Title LIKE '%"+ word +"%' "
					+ "ORDER BY a.News_Date DESC";
		}
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				News news = new News();
				news.getTest().setTestId(rs.getInt("Test_ID"));
				news.getTest().setCategory(rs.getString("Test_Category"));
				news.getSchedule().setScheduleName(rs.getString("Schedule_Name"));
				news.setId(rs.getInt("News_ID"));
				news.setTitle(rs.getString("News_Title"));
				news.setContent(rs.getString("News_Contents"));
				news.getManager().setManagerAccount(rs.getString("Manager_Account"));
				news.getSchedule().setScheduleId(rs.getInt("Schedule_ID"));
				news.setCreateDate(rs.getDate("News_Date"));
				newsList.add(news);
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
		return newsList;
	}
	
	public List<News> getMonthList(String test,String month,String word) {
		// TODO Auto-generated method stub
		List<News> newsList = new ArrayList<News>();
		
		if(test.equals("學測")){
			test = "1";
		}
		else if(test.equals("指考")){
			test = "2";
		}
		else if(test.equals("英聽")){
			test = "3";
		}
		else if(test.equals("其他")){
			test = "4";
		}
		String sql = "SELECT * FROM news a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "JOIN  schedule c ON a.Schedule_ID = c.Schedule_ID "
				+ "WHERE a.News_Title LIKE '%"+ word +"%' AND a.Test_ID = '"+ test +"' "
				+ "AND MONTH(News_Date) = '"+ month +"' "
				+ "ORDER BY a.News_Date DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				News news = new News();
				news.getTest().setTestId(rs.getInt("Test_ID"));
				news.getTest().setCategory(rs.getString("Test_Category"));
				news.getSchedule().setScheduleName(rs.getString("Schedule_Name"));
				news.setId(rs.getInt("News_ID"));
				news.setTitle(rs.getString("News_Title"));
				news.setContent(rs.getString("News_Contents"));
				news.getManager().setManagerAccount(rs.getString("Manager_Account"));
				news.getSchedule().setScheduleId(rs.getInt("Schedule_ID"));
				news.setCreateDate(rs.getDate("News_Date"));
				newsList.add(news);
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
		return newsList;
	}
}