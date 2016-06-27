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
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.PastPaper;

@Controller
public class PastPaperController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/SC_Page_pastpaper_subject", method = RequestMethod.GET)
	public ModelAndView SC_Page_pastpaper_subjectGetPastPaperList(@RequestParam("subject") String subject) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SC_Page_pastpaper_subject");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測歷屆試題抓資料庫用(傳值)
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		pastPaperList = pastPaperDAO.getListSubject(subject);
		model.addObject("pastPaperList", pastPaperList);
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
		
		model.addObject("s", "");
		
		return model;
	}
	
	@RequestMapping(value = "/SS_Page_pastpaper_subject", method = RequestMethod.GET)
	public ModelAndView SS_Page_pastpaper_subjectGetPastPaperList(@RequestParam("subject") String subject) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("SS_Page_pastpaper_subject");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 指考歷屆試題抓資料庫用(傳值)
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		subject = new String(subject.getBytes("ISO-8859-1"), "utf-8");  //轉編碼
		pastPaperList = pastPaperDAO.getListSubject_SS(subject);
		model.addObject("pastPaperList", pastPaperList);
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
		// 指考參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);
				
		model.addObject("s", "");	
		return model;
	}
		
	@RequestMapping(value = "/SC_Page_pastpaper_year", method = RequestMethod.GET)
	public ModelAndView SC_Page_pastpaper_year(@RequestParam("year") String year){
		ModelAndView model = new ModelAndView("SC_Page_pastpaper_year");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 學測歷屆試題抓資料庫用(傳值)
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		pastPaperList = pastPaperDAO.getListYear(year);
		model.addObject("pastPaperList", pastPaperList);
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
		
		model.addObject("s", "");
		
		return model;
	}
	
	@RequestMapping(value = "/SS_Page_pastpaper_year", method = RequestMethod.GET)
	public ModelAndView SS_Page_pastpaper_year(@RequestParam("year") String year){
		ModelAndView model = new ModelAndView("SS_Page_pastpaper_year");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 指考歷屆試題抓資料庫用(傳值)
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		pastPaperList = pastPaperDAO.getListYear_SS(year);
		model.addObject("pastPaperList", pastPaperList);
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
		// 指考參考佳作navbar用(subject)
		MasterpieceDAO masterpieceDAOForNavBarSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForNavBarSubject = new ArrayList<Masterpiece>();
		masterpieceListForNavBarSubject = masterpieceDAOForNavBarSubject.getListForNavBarSubject_SS();
		model.addObject("masterpieceListForNavBarSubject", masterpieceListForNavBarSubject);	
		
		model.addObject("s", "");	
		
		return model;
	}
	
	@RequestMapping(value = "/EL_Page_pastpaper", method = RequestMethod.GET)
	public ModelAndView EL_Page_pastpaper(){
		ModelAndView model = new ModelAndView("EL_Page_pastpaper");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 英聽歷屆試題抓資料庫用(傳值)
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		pastPaperList = pastPaperDAO.getList_EL();
		model.addObject("pastPaperList", pastPaperList);
		
		return model;
	}
	
	
}