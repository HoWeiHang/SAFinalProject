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
		String sql = "INSERT news(Test_Category,News_Title,News_Contents,News_Staff,Schedule_Name,News_Date) "
				+ "VALUES(?,?,?,?,?,NOW())";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setString(1, news.getTest().getCategory());
			smt.setString(2, news.getTitle());
			smt.setString(3, news.getContent());
			smt.setString(4, news.getIssuePerson());
			smt.setString(5, news.getSchedule().getScheduleName());
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
	public void delete(News news) {
		// TODO Auto-generated method stub
				String sql = "DELETE FROM news WHERE News_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setInt(1, news.getId());
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
				String sql = "UPDATE news SET Test_Category=?, News_Title=?, News_Contents=?, News_Staff=?, Schedule_Name=?, News_Date=NOW() "
						+ "WHERE News_ID = ?";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setString(1, news.getTest().getCategory());
					smt.setString(2, news.getTitle());
					smt.setString(3, news.getContent());
					smt.setString(4, news.getIssuePerson());
					smt.setString(5, news.getSchedule().getScheduleName());
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
	public List<News> getList() {
		// TODO Auto-generated method stub
		List<News> newsList = new ArrayList<News>();
		String sql = "SELECT * FROM news  "
				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				News news = new News();
		//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
				news.getTest().setCategory(rs.getString("Test_Category"));
				news.setId(rs.getInt("News_ID"));
				news.setTitle(rs.getString("News_Title"));
				news.setContent(rs.getString("News_Contents"));
				news.setIssuePerson(rs.getString("News_Staff"));
				news.getSchedule().setScheduleName(rs.getString("Schedule_Name"));
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
		return null;
	}
}