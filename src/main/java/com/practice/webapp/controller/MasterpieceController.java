package com.practice.webapp.controller;

import java.io.UnsupportedEncodingException;
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
public class MasterpieceController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/SC_Page_masterpiece", method = RequestMethod.GET)
	public ModelAndView SC_Page_masterpiece(@RequestParam("subject") String subject) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SC_Page_masterpiece");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測參考佳作抓年份
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		masterpieceList = masterpieceDAO.getListYear();
		model.addObject("masterpieceList", masterpieceList);
		model.addObject("subject", subject);
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
				
		return model;
	}
	
	@RequestMapping(value = "/SS_Page_masterpiece", method = RequestMethod.GET)
	public ModelAndView SS_Page_masterpiece(@RequestParam("subject") String subject) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SS_Page_masterpiece");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測參考佳作抓年份
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		masterpieceList = masterpieceDAO.getListYear();
		model.addObject("masterpieceList", masterpieceList);
		model.addObject("subject", subject);
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
				
		return model;
	}
	
	@RequestMapping(value = "/SC_Page_masterpiece_content", method = RequestMethod.GET)
	public ModelAndView SC_Page_masterpiece_content(@RequestParam("subject") String subject,@RequestParam("year") String year) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SC_Page_masterpiece_content");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測參考佳作抓資料庫用
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		masterpieceList = masterpieceDAO.getListSubject(subject,year);
		model.addObject("masterpieceList", masterpieceList);
		model.addObject("subject", subject);
		
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
				
		return model;
	}
	
	@RequestMapping(value = "/SS_Page_masterpiece_content", method = RequestMethod.GET)
	public ModelAndView SS_Page_masterpiece_content(@RequestParam("subject") String subject,@RequestParam("year") String year) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SS_Page_masterpiece_content");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測參考佳作抓資料庫用
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		masterpieceList = masterpieceDAO.getListSubject_SS(subject,year);
		model.addObject("masterpieceList", masterpieceList);
		model.addObject("subject", subject);
		
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
				
		return model;
	}
}