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
public class FooterRelativePageController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ModelAndView test(){
//		ModelAndView model = new ModelAndView("test");		
//		return model;
//	}
	
	@RequestMapping(value = "/aboutcenter_introduction", method = RequestMethod.GET)
	public ModelAndView aboutcenter_introduction(){
		ModelAndView model = new ModelAndView("aboutcenter_introduction");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/aboutcenter_office", method = RequestMethod.GET)
	public ModelAndView aboutcenter_office(){
		ModelAndView model = new ModelAndView("aboutcenter_office");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/aboutcenter_structure", method = RequestMethod.GET)
	public ModelAndView aboutcenter_structure(){
		ModelAndView model = new ModelAndView("aboutcenter_structure");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/downloadregion_allsoftware", method = RequestMethod.GET)
	public ModelAndView downloadregion_allsoftware(){
		ModelAndView model = new ModelAndView("downloadregion_allsoftware");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/downloadregion_disabledInformation", method = RequestMethod.GET)
	public ModelAndView downloadregion_disabledInformation(){
		ModelAndView model = new ModelAndView("downloadregion_disabledInformation");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/downloadregion_other", method = RequestMethod.GET)
	public ModelAndView downloadregion_other(){
		ModelAndView model = new ModelAndView("downloadregion_other");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/downloadregion_relativeFile", method = RequestMethod.GET)
	public ModelAndView downloadregion_relativeFile(){
		ModelAndView model = new ModelAndView("downloadregion_relativeFile");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange", method = RequestMethod.GET)
	public ModelAndView syllabuschange(){
		ModelAndView model = new ModelAndView("syllabuschange");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content1_1", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content1_1(){
		ModelAndView model = new ModelAndView("syllabuschange_content1_1");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content1_2", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content1_2(){
		ModelAndView model = new ModelAndView("syllabuschange_content1_2");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content2", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content2(){
		ModelAndView model = new ModelAndView("syllabuschange_content2");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content3_1", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content3_1(){
		ModelAndView model = new ModelAndView("syllabuschange_content3_1");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content3_2", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content3_2(){
		ModelAndView model = new ModelAndView("syllabuschange_content3_2");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content4", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content4(){
		ModelAndView model = new ModelAndView("syllabuschange_content4");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content5", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content5(){
		ModelAndView model = new ModelAndView("syllabuschange_content5");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content6_1", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content6_1(){
		ModelAndView model = new ModelAndView("syllabuschange_content6_1");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content6_2", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content6_2(){
		ModelAndView model = new ModelAndView("syllabuschange_content6_2");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/syllabuschange_content7", method = RequestMethod.GET)
	public ModelAndView syllabuschange_content7(){
		ModelAndView model = new ModelAndView("syllabuschange_content7");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/Relativewebsite", method = RequestMethod.GET)
	public ModelAndView Relativewebsite(){
		ModelAndView model = new ModelAndView("Relativewebsite");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
	
	@RequestMapping(value = "/other", method = RequestMethod.GET)
	public ModelAndView other(){
		ModelAndView model = new ModelAndView("other");
		Manager account_session = (Manager)context.getBean("account");
		model.addObject("manager", account_session);
		model.addObject("checkout", "");
		
		return model;
	}
}