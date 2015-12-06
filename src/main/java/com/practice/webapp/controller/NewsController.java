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
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.entity.Article;
import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.Test;

@Controller
public class NewsController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/SCIndexView", method = RequestMethod.GET)
	public ModelAndView SCIndexViewGetNewsList(){
		ModelAndView model = new ModelAndView("SCIndexView");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList();
		model.addObject("newsList", newsList);
		return model;
	}
	
	@RequestMapping(value = "/SC_Page_introduction", method = RequestMethod.GET)
	public ModelAndView intro(){
		ModelAndView model = new ModelAndView("SC_Page_introduction");
	
		return model;
	}
	
	@RequestMapping(value = "/insertNews", method = RequestMethod.GET)
	public ModelAndView insertNewsPage(){
		ModelAndView model = new ModelAndView("insertNews");
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testCategoryList = new ArrayList<Test>();
		testCategoryList = testCategoryDAO.getList();
		model.addObject("testCategoryList", testCategoryList);
		return model;
	}
	
	@RequestMapping(value = "/insertNews", method = RequestMethod.POST)
	public ModelAndView insertNews(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("redirect:/SC_Page_news");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		newsDAO.insert(news);
		
		return model;
	}

	@RequestMapping(value = "/SC_Page_news", method = RequestMethod.GET)
	public ModelAndView SC_Page_newsGetNewsList(){
		ModelAndView model = new ModelAndView("SC_Page_news");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getList();
		model.addObject("newsList", newsList);
		return model;
	}
	
	@RequestMapping(value = "/updateNews", method = RequestMethod.GET)
	public ModelAndView updateNewsPage(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("updateNews");

		return model;
	}
	
	@RequestMapping(value = "/updateNews", method = RequestMethod.POST)
	public ModelAndView updateNews(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("redirect:/SC_Page_news");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		newsDAO.update(news);
		
		return model;
	}
	
	@RequestMapping(value = "/deleteNews", method = RequestMethod.POST)
	public ModelAndView deleteNews(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("redirect:/SC_Page_news");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		newsDAO.delete(news);
		
		return model;
	}
	
}