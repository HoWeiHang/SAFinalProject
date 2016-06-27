package com.practice.webapp.dao;

import java.util.List;
import com.practice.webapp.entity.Statistic;

public interface StatisticDAO {
	public void insert(Statistic statistic);
	public void delete(String id);
	public void update(Statistic statistic);
	public List<Statistic> getData(String year,String region,String name,String TestID);
	public List<Statistic> getYearList();
	public List<Statistic> getRegionList(String TestID);
	public List<Statistic> getNameList();
	public List<Statistic> getAllList();
	public List<Statistic> getDistinctRegion();
	public Statistic get(Statistic statistic);
}


