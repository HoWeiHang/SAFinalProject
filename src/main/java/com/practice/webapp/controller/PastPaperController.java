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

import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.entity.Test;
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
	public ModelAndView SC_Page_pastpaper_subjectGetPastPaperList(){
		ModelAndView model = new ModelAndView("SC_Page_pastpaper_subject");
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		pastPaperList = pastPaperDAO.getList();
		model.addObject("pastPaperList", pastPaperList);
		return model;
	}
}