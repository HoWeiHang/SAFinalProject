package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Schedule;

@Controller
public class ScheduleController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/SC_Page_schedule", method = RequestMethod.GET)
	public ModelAndView SC_Page_schedule(){
		ModelAndView model = new ModelAndView("SC_Page_schedule");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// �Ǵ��ҵ{���C�X�ҵ{
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getList("1");
		model.addObject("scheduleList", scheduleList);
		// �������Dnavbar��(subject)
		PastPaperDAO pastPaperDAOForNavBarSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarSubject = new ArrayList<PastPaper>();
		pastPaperListForNavBarSubject = pastPaperDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("pastPaperListForNavBarSubject", pastPaperListForNavBarSubject);
		// �������Dnavbar��(Year)
		PastPaperDAO pastPaperDAOForNavBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForNavBarYear = new ArrayList<PastPaper>();
		pastPaperListForNavBarYear = pastPaperDAOForNavBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForNavBarYear", pastPaperListForNavBarYear);
		// �ѦҨΧ@navbar��(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
		
		return model;
	}
	
	// ����
	@RequestMapping(value = "/SS_Page_schedule", method = RequestMethod.GET)
	public ModelAndView SS_Page_schedule(){
		ModelAndView model = new ModelAndView("SS_Page_schedule");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// ���Ҧҵ{���C�X�ҵ{
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
	
	// �^ť
	@RequestMapping(value = "/EL_Page_schedule", method = RequestMethod.GET)
	public ModelAndView EL_Page_schedule(){
		ModelAndView model = new ModelAndView("EL_Page_schedule");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// �^ť�ҵ{���C�X�ҵ{
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getList("3");
		model.addObject("scheduleList", scheduleList);
		
		
		
		return model;
	}
	
}