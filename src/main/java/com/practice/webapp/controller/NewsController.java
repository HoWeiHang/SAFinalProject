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
public class NewsController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/SC_Page_news", method = RequestMethod.GET)
	public ModelAndView SC_Page_newsGetNewsList(){
		ModelAndView model = new ModelAndView("SC_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		// �Ǵ����������C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("1");
		model.addObject("newsList", newsList);
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
	
	@RequestMapping(value = "/SC_Page_news_Search", method = RequestMethod.GET)
	public ModelAndView SC_Page_news_Search(@RequestParam("word") String word,@RequestParam("month") String month)throws UnsupportedEncodingException{
		
		ModelAndView model = new ModelAndView("SC_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		if(month.equals("all")){
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getWordList("1",word);
			model.addObject("newsList", newsWordList);
		}
		else{
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getMonthList("1",month,word);
			model.addObject("newsList", newsWordList);
			}
     
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

	// ����
	@RequestMapping(value = "/SS_Page_news", method = RequestMethod.GET)
	public ModelAndView SS_Page_news(){
		ModelAndView model = new ModelAndView("SS_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// ���Ү��������C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("2");
		model.addObject("newsList", newsList);
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
	
	@RequestMapping(value = "/SS_Page_news_Search", method = RequestMethod.GET)
	public ModelAndView SS_Page_news_Search(@RequestParam("word") String word,@RequestParam("month") String month)throws UnsupportedEncodingException{
		
		ModelAndView model = new ModelAndView("SS_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		if(month.equals("all")){
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getWordList("2",word);
			model.addObject("newsList", newsWordList);
		}
		else{
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getMonthList("2",month,word);
			model.addObject("newsList", newsWordList);
			}
     
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
	
	// �^ť
	@RequestMapping(value = "/EL_Page_news", method = RequestMethod.GET)
	public ModelAndView EL_Page_news(){
		ModelAndView model = new ModelAndView("EL_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		// �^ť���������C�X����
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList("3");
		model.addObject("newsList", newsList);
		
		
		return model;
	}
	
	@RequestMapping(value = "/EL_Page_news_Search", method = RequestMethod.GET)
	public ModelAndView EL_Page_news_Search(@RequestParam("word") String word,@RequestParam("month") String month)throws UnsupportedEncodingException{
		
		ModelAndView model = new ModelAndView("EL_Page_news");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		if(month.equals("all")){
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getWordList("3",word);
			model.addObject("newsList", newsWordList);
		}
		else{
			word = new String(word.getBytes("ISO-8859-1"), "utf-8");
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			List<News> newsWordList = new ArrayList<News>();
			newsWordList = newsDAO.getMonthList("3",month,word);
			model.addObject("newsList", newsWordList);
			}
     
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