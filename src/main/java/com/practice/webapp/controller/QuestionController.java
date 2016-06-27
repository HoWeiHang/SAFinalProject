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
import com.practice.webapp.dao.QuestionDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.entity.Test;
import com.practice.webapp.entity.Question;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Schedule;

@Controller
public class QuestionController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/EL_Page_question", method = RequestMethod.GET)
	public ModelAndView EL_Page_question(){
		ModelAndView model = new ModelAndView("EL_Page_question");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		// 英聽Q&A頁面列出"考試簡介"
		QuestionDAO questionDAO_First = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList_First = new ArrayList<Question>();
		questionList_First = questionDAO_First.getList_FirstDetail();
		model.addObject("questionList_First", questionList_First);	
		// 英聽Q&A頁面列出"應考相關"
		QuestionDAO questionDAO_Second = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList_Second = new ArrayList<Question>();
		questionList_Second = questionDAO_Second.getList_SecondDetail();
		model.addObject("questionList_Second", questionList_Second);
		// 英聽Q&A頁面列出"考場相關"
		QuestionDAO questionDAO_Third = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList_Third = new ArrayList<Question>();
		questionList_Third = questionDAO_Third.getList_ThirdDetail();
		model.addObject("questionList_Third", questionList_Third);
		// 英聽Q&A頁面列出"試題相關"
		QuestionDAO questionDAO_Fourth = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList_Fourth = new ArrayList<Question>();
		questionList_Fourth = questionDAO_Fourth.getList_FourthDetail();
		model.addObject("questionList_Fourth", questionList_Fourth);
		// 英聽Q&A頁面列出"成績相關"
		QuestionDAO questionDAO_Fifth = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList_Fifth = new ArrayList<Question>();
		questionList_Fifth = questionDAO_Fifth.getList_FifthDetail();
		model.addObject("questionList_Fifth", questionList_Fifth);
		
	    
		
		return model;
	}
}