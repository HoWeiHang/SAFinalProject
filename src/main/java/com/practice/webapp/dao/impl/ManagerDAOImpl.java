package com.practice.webapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.practice.webapp.dao.ManagerDAO;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;

public class ManagerDAOImpl  implements ManagerDAO{
	private DataSource dataSource;
	private Connection conn = null ;
	private ResultSet rs = null ;
	private PreparedStatement smt = null ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public boolean checkLogin(Manager login_manager) {
		List<Manager> managerList = new ArrayList<Manager>();
		String sql = "SELECT * FROM manager";
		boolean checkLogin = false;
//				+ "ORDER BY News_ID DESC";
		try {
			conn = dataSource.getConnection();
			smt = conn.prepareStatement(sql);
			rs = smt.executeQuery();
			while(rs.next()){
				String account = rs.getString("Manager_Account");
				String password = rs.getString("Manager_Password");
				if(login_manager.getManagerAccount().equals(account) && login_manager.getManagerPassword().equals(password)){
					checkLogin = true;
				}
				/*Manager manager = new Manager();
				manager.setManagerAccount(rs.getString("Manager_Account"));
				manager.setManagerPassword(rs.getString("Manager_Password"));
				managerList.add(manager);*/
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
		return checkLogin;
	}

}
