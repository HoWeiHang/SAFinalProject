package com.practice.webapp.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.dao.StatisticDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.Statistic;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Schedule;

@Controller
public class StatisticController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	@RequestMapping(value = "/SC_Page_statistic_Search", method = RequestMethod.GET)
	public ModelAndView SC_Page_statistic(@RequestParam("year") String year,@RequestParam("sortbig") String region,@RequestParam("smallsort") String name,@RequestParam("check") String check,@RequestParam("TestID") String TestID)throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SC_Page_statistic");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		year = new String(year.getBytes("ISO-8859-1"), "utf-8");
		region = new String(region.getBytes("ISO-8859-1"), "utf-8");
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		StatisticDAO statisticDAOSearch = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchData = new ArrayList<Statistic>();
        statisticSearchData = statisticDAOSearch.getData(year,region,name,TestID);
        model.addObject("statisticSearchData", statisticSearchData);
        
        // 學測歷屆試題navbar用(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// 學測歷屆試題navbar用(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// 學測參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
        
        // searchbar用(無傳值)
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearch.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearch.getRegionList("1");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);
        model.addObject("check", check);
     
		return model;
	}
	
	@RequestMapping(value = "/SC_Page_statistic", method = RequestMethod.GET)
	public ModelAndView SC_Page_statistic(){
		ModelAndView model = new ModelAndView("SC_Page_statistic");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		// 學測歷屆試題navbar用(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// 學測歷屆試題navbar用(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// 學測參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		// searchbar用(無傳值)
        StatisticDAO statisticDAOSearchBar = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearchBar.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearchBar.getRegionList("1");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);

		return model;
	}
	
	@RequestMapping(value = "/SS_Page_statistic_Search", method = RequestMethod.GET)
	public ModelAndView SS_Page_statistic(@RequestParam("year") String year,@RequestParam("sortbig") String region,@RequestParam("smallsort") String name,@RequestParam("check") String check,@RequestParam("TestID") String TestID)throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SS_Page_statistic");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		year = new String(year.getBytes("ISO-8859-1"), "utf-8");
		region = new String(region.getBytes("ISO-8859-1"), "utf-8");
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		StatisticDAO statisticDAOSearch = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchData = new ArrayList<Statistic>();
        statisticSearchData = statisticDAOSearch.getData(year,region,name,TestID);
        model.addObject("statisticSearchData", statisticSearchData);
        
        // 指考參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		// 指考歷屆試題navbar用(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// 指考歷屆試題navbar用(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear_SS();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
        
        // searchbar用(無傳值)
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearch.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearch.getRegionList("2");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);
        model.addObject("check", check);
     
		return model;
	}
	
	@RequestMapping(value = "/SS_Page_statistic", method = RequestMethod.GET)
	public ModelAndView SS_Page_statistic(){
		ModelAndView model = new ModelAndView("SS_Page_statistic");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 指考參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		// 指考歷屆試題navbar用(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// 指考歷屆試題navbar用(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear_SS();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// searchbar用(無傳值)
        StatisticDAO statisticDAOSearchBar = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearchBar.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearchBar.getRegionList("2");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);

		return model;
	}
	
	@RequestMapping(value = "/EL_Page_statistic_Search", method = RequestMethod.GET)
	public ModelAndView EL_Page_statistic(@RequestParam("year") String year,@RequestParam("sortbig") String region,@RequestParam("smallsort") String name,@RequestParam("check") String check,@RequestParam("TestID") String TestID)throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("EL_Page_statistic");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		year = new String(year.getBytes("ISO-8859-1"), "utf-8");
		region = new String(region.getBytes("ISO-8859-1"), "utf-8");
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		StatisticDAO statisticDAOSearch = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchData = new ArrayList<Statistic>();
        statisticSearchData = statisticDAOSearch.getData(year,region,name,TestID);
        model.addObject("statisticSearchData", statisticSearchData);
        
        // searchbar用(無傳值)
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearch.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearch.getRegionList("3");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);
        model.addObject("check", check);
     
		return model;
	}
	
	@RequestMapping(value = "/EL_Page_statistic", method = RequestMethod.GET)
	public ModelAndView EL_Page_statistic(){
		ModelAndView model = new ModelAndView("EL_Page_statistic");	
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// searchbar用(無傳值)
        StatisticDAO statisticDAOSearchBar = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearchBar.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearchBar.getRegionList("3");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);

		return model;
	}
}