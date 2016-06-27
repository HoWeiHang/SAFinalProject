package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Schedule;

public interface ScheduleDAO {
	public List<Schedule> getList(String test);
	public List<Schedule> getAllList();
	public void delete(String id);
	public void insert(Schedule schedule);
	public void update(Schedule schedule);
	public Schedule get(Schedule schedule);
}
