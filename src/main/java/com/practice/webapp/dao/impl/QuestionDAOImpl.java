package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.QuestionDAO;
import com.practice.webapp.entity.Question;
import com.practice.webapp.entity.Statistic;

public class QuestionDAOImpl implements QuestionDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Question> getList_FirstDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question WHERE Question_Detail='考試簡介'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				question.getTest().setTestId(rs.getInt("Test_ID"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getList_SecondDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question WHERE Question_Detail='應考相關'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				question.getTest().setTestId(rs.getInt("Test_ID"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getList_ThirdDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question WHERE Question_Detail='考場相關'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				question.getTest().setTestId(rs.getInt("Test_ID"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getList_FourthDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question WHERE Question_Detail='試題相關'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				question.getTest().setTestId(rs.getInt("Test_ID"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getList_FifthDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question WHERE Question_Detail='成績相關'";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				question.getTest().setTestId(rs.getInt("Test_ID"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getAllList() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT * FROM question a "
				+ "JOIN test b ON a.Test_ID = b.Test_ID "
				+ "ORDER BY Question_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.getTest().setTestId(rs.getInt("Test_ID"));
				question.getTest().setCategory(rs.getString("Test_Category"));
				question.setQuestionId(rs.getInt("Question_ID"));
				question.setQuestionName(rs.getString("Question_Name"));
				question.setQuestionContent(rs.getString("Question_Contents"));
				question.setQuestionDetail(rs.getString("Question_Detail"));
				questionList.add(question);
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
		return questionList;
	}
	
	@Override
	public List<Question> getDistinctDetail() {
		// TODO Auto-generated method stub
		List<Question> questionList = new ArrayList<Question>();
		String sql = "SELECT DISTINCT Question_Detail FROM question";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Question question = new Question();
				question.setQuestionDetail(rs.getString("Question_Detail"));
				questionList.add(question);
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
		return questionList;
	}

	@Override
	public void insert(Question question) {
		// TODO Auto-generated method stub
		String sql = "INSERT question(Test_ID,Question_Name,Question_Contents,Question_Detail) "
				+ "VALUES(?,?,?,?)";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, question.getTest().getTestId());
			smt.setString(2, question.getQuestionName());
			smt.setString(3, question.getQuestionContent());
			smt.setString(4, question.getQuestionDetail());
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
		String sql = "DELETE FROM question WHERE Question_ID = ?";
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
	public void update(Question question) {
		// TODO Auto-generated method stub
		String sql = "UPDATE question SET Test_ID=?, Question_Name=?, Question_Contents=?, Question_Detail=?"
				+ "WHERE Question_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, question.getTest().getTestId());
			smt.setString(2, question.getQuestionName());
			smt.setString(3, question.getQuestionContent());
			smt.setString(4, question.getQuestionDetail());
			smt.setInt(5, question.getQuestionId());
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
	public Question get(Question question) {
		// TODO Auto-generated method stub
				List<Question> questionList = new ArrayList<Question>();
				String sql = "SELECT * FROM question WHERE Question_ID = ? ";
			try {
				conn = dataSource.getConnection();
				smt = conn.prepareStatement(sql);
				smt.setInt(1, question.getQuestionId());
				rs = smt.executeQuery();
				if(rs.next()){
			//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
					question.getTest().setTestId(rs.getInt("Test_ID"));
					question.setQuestionId(rs.getInt("Question_ID"));
					question.setQuestionName(rs.getString("Question_Name"));
					question.setQuestionContent(rs.getString("Question_Contents"));
					question.setQuestionDetail(rs.getString("Question_Detail"));
					questionList.add(question);
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
			 return question;
	}
	
}