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
		
	}

	@Override
	public void delete(PastPaper pastPaper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PastPaper pastPaper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PastPaper> getList() {
		// TODO Auto-generated method stub
				List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
				String sql = "SELECT * FROM past_paper WHERE  Past_Paper_Subject='Chinese'";
//						+ "ORDER BY News_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						PastPaper pastPaper = new PastPaper();
						pastPaper.getTest().setCategory(rs.getString("Test_Category"));
						pastPaper.setPastPaperId(rs.getInt("Past_Paper_ID"));
						pastPaper.setPastPaperYear(rs.getInt("Past_Paper_Year"));
						pastPaper.setPastPaperSubject(rs.getString("Past_Paper_Subject"));
						pastPaper.setPastPaperPDF(rs.getString("Past_Paper_PDF"));
						pastPaper.setPastPaperWORD(rs.getString("Past_Paper_WORD"));
						pastPaper.setPastPaperAnswer(rs.getString("Past_Paper_Answer"));
						pastPaper.setPastPaperScore(rs.getString("Past_Paper_Score"));
//						pastPaper.setPastPaperVoice(rs.getString(""));
//						pastPaper.setPastPaperVTable(rs.getString(""));
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
		return null;
	}
}