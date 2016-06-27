package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.ArticleCategoryDAO;
import com.practice.webapp.dao.ArticleDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.Article;
import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.Schedule;

@Controller
public class IndexController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/Firstpage", method = RequestMethod.GET)
	public ModelAndView Firstpage(){
		ModelAndView model = new ModelAndView("Firstpage");	
		
		return model;
	}
	
	@RequestMapping(value = "/SCIndexView", method = RequestMethod.GET)
	public ModelAndView SCIndexViewGetNewsList(){
		ModelAndView model = new ModelAndView("SCIndexView");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");

		// �Ǵ������C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("1");
		model.addObject("newsList", newsList);
		// �Ǵ������C�X�ҵ{
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getList("1");
		model.addObject("scheduleList", scheduleList);
		// �Ǵ��������Dnavbar��(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// �Ǵ��������Dnavbar��(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// �Ǵ��ѦҨΧ@navbar��(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		
		return model;
	}
	
	@RequestMapping(value = "/SSIndexView", method = RequestMethod.GET)
	public ModelAndView SSIndexView(){
		ModelAndView model = new ModelAndView("SSIndexView");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// ���ҭ����C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("2");
		model.addObject("newsList", newsList);
		// ���ҭ����C�X�ҵ{
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getList("2");
		model.addObject("scheduleList", scheduleList);
		// ���ҰѦҨΧ@navbar��(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		// ���Ҿ������Dnavbar��(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// ���Ҿ������Dnavbar��(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear_SS();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		
		return model;
	}
	
	@RequestMapping(value = "/ELIndexView", method = RequestMethod.GET)
	public ModelAndView ELIndexView(){
		ModelAndView model = new ModelAndView("ELIndexView");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// �^ť�����C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("3");
		model.addObject("newsList", newsList);
		// �^ť�����C�X�ҵ{
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getList("3");
		model.addObject("scheduleList", scheduleList);
		
		
		return model;
	}
	
	@RequestMapping(value = "/IndexView", method = RequestMethod.GET)
	public ModelAndView IndexView(){
		ModelAndView model = new ModelAndView("IndexView");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("4");
		model.addObject("newsOtherList", newsList);
		newsList = newsDAO.getList("1");
		model.addObject("newsSCList", newsList);
		newsList = newsDAO.getList("2");
		model.addObject("newsSSList", newsList);
		newsList = newsDAO.getList("3");
		model.addObject("newsELList", newsList);
		
		// ���ҰѦҨΧ@navbar��(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject_SS = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject_SS = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject_SS = masterpieceDAOForNavBarSubject_SS.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject_SS", masterpieceListForNavBarSubject_SS);
		// ���Ҿ������Dnavbar��(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject_SS = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject_SS = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject_SS = pastPaperDAOForNavBarSubject_SS.getListForNavBarSubject_SS();
		model.addObject("pastPaperListForNavBarSubject_SS", pastPaperListForNavBarSubject_SS);
		// ���Ҿ������Dnavbar��(Year)
		PastPaperDAO pastPaperDAOForNavBarYear_SS = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear_SS = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear_SS = pastPaperDAOForNavBarYear_SS.getListForNavBarYear_SS();
		model.addObject("pastPaperListForNavBarYear_SS", pastPaperListForNavBarYear_SS);
		
		// �Ǵ��������Dnavbar��(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// �Ǵ��������Dnavbar��(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// �Ǵ��ѦҨΧ@navbar��(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		
		return model;
	}
	
}