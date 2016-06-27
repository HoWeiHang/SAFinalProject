package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.Manager;

public interface ManagerDAO {	
	public boolean checkLogin(Manager manager);
}