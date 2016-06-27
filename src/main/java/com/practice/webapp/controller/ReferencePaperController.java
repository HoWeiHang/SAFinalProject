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
import com.practice.webapp.dao.ReferencePaperDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.ReferencePaper;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Schedule;

@Controller
public class ReferencePaperController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/EL_Page_referencepaper", method = RequestMethod.GET)
	public ModelAndView EL_Page_referencepaper(){
		ModelAndView model = new ModelAndView("EL_Page_referencepaper");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		// 璣钮把σ刚把σ刚
		ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
		referencePaperList = referencePaperDAO.getList_EL();
		model.addObject("referencePaperList", referencePaperList);	
		
		ReferencePaperDAO referencePaperDAO1 = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		List<ReferencePaper> referencePaperList1 = new ArrayList<ReferencePaper>();
		referencePaperList1 = referencePaperDAO1.getList_EL();
		model.addObject("referencePaperList1", referencePaperList1);
		// distinct year
		ReferencePaperDAO referencePaperDAOForDistinctYear = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		List<ReferencePaper> referencePaperListForDistinctYear = new ArrayList<ReferencePaper>();
		referencePaperListForDistinctYear = referencePaperDAOForDistinctYear.getDistinctYear();
		model.addObject("referencePaperListForDistinctYear", referencePaperListForDistinctYear);
		model.addObject("a", "粂郎更");
		model.addObject("b", "刚肈更");
		model.addObject("c", "把σ氮更");
	    
		
		return model;
	}
}