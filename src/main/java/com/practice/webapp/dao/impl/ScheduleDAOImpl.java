package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.Schedule;

public class ScheduleDAOImpl implements ScheduleDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Schedule> getList(String test) {
		// TODO Auto-generated method stub
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		String sql = "SELECT * FROM schedule WHERE Test_ID='"+test+"'"
				+ "ORDER BY Schedule_StartTime ASC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				Schedule schedule = new Schedule();
				schedule.setScheduleId(rs.getInt("Schedule_ID"));
				schedule.setScheduleName(rs.getString("Schedule_Name"));
				schedule.setSchedulePostTime(rs.getDate("Schedule_PostTime"));
				schedule.setScheduleStartTime(rs.getString("Schedule_StartTime"));
				schedule.setScheduleEndTime(rs.getString("Schedule_EndTime"));
				schedule.getTest().setTestId(rs.getInt("Test_ID"));
				scheduleList.add(schedule);
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
		return scheduleList;
	}
	
	@Override
	public List<Schedule> getAllList() {
		// TODO Auto-generated method stub
				List<Schedule> scheduleList = new ArrayList<Schedule>();
				String sql = "SELECT * FROM schedule a "
						+ "JOIN test b ON a.Test_ID = b.Test_ID "
						+ "ORDER BY Schedule_ID DESC";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					rs = smt.executeQuery();
					while(rs.next()){
						Schedule schedule = new Schedule();
						schedule.getTest().setTestId(rs.getInt("Test_ID"));
						schedule.getTest().setCategory(rs.getString("Test_Category"));
						schedule.setScheduleId(rs.getInt("Schedule_ID"));
						schedule.setScheduleName(rs.getString("Schedule_Name"));
						schedule.setSchedulePostTime(rs.getDate("Schedule_PostTime"));
						schedule.setScheduleStartTime(rs.getString("Schedule_StartTime"));
						schedule.setScheduleEndTime(rs.getString("Schedule_EndTime"));
						scheduleList.add(schedule);
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
				return scheduleList;
	}
	
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
				String sql = "DELETE FROM schedule WHERE Schedule_ID = ?";
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
	public void insert(Schedule schedule) {
		// TODO Auto-generated method stub
				String sql = "INSERT schedule(Schedule_Name,Test_ID,Schedule_PostTime,Schedule_StartTime,Schedule_EndTime) "
						+ "VALUES(?,?,NOW(),?,?)";
				try {
					conn = dataSource.getConnection();
					smt = conn.prepareStatement(sql);
					smt.setString(1, schedule.getScheduleName());
					smt.setInt(2, schedule.getTest().getTestId());
					smt.setString(3, schedule.getScheduleStartTime());
					smt.setString(4, schedule.getScheduleEndTime());
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
	public void update(Schedule schedule) {
		// TODO Auto-generated method stub
		String sql = "UPDATE schedule SET Test_ID=?, Schedule_Name=?, Schedule_PostTime=NOW(), Schedule_StartTime=?, Schedule_EndTime=?"
				+ "WHERE Schedule_ID = ?";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, schedule.getTest().getTestId());
			smt.setString(2, schedule.getScheduleName());
			smt.setString(3, schedule.getScheduleStartTime());
			smt.setString(4, schedule.getScheduleEndTime());
			smt.setInt(5, schedule.getScheduleId());
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
	public Schedule get(Schedule schedule) {
		// TODO Auto-generated method stub
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		String sql = "SELECT * FROM schedule WHERE Schedule_ID = ? ";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			smt.setInt(1, schedule.getScheduleId());
			rs = smt.executeQuery();
			if(rs.next()){
		//		article.getArticleCategory().setId(rs.getInt("articleCategoryID"));
				schedule.getTest().setTestId(rs.getInt("Test_ID"));
				schedule.setScheduleId(rs.getInt("Schedule_ID"));
				schedule.setScheduleName(rs.getString("Schedule_Name"));
				schedule.setSchedulePostTime(rs.getDate("Schedule_PostTime"));
				schedule.setScheduleStartTime(rs.getString("Schedule_StartTime"));
				schedule.setScheduleEndTime(rs.getString("Schedule_EndTime"));
				scheduleList.add(schedule);
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
		return schedule;
	}
	
}
