
package com.practice.webapp.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.FormDAO;
import com.practice.webapp.dao.ManagerDAO;
import com.practice.webapp.dao.MasterpieceDAO;
import com.practice.webapp.dao.NewsDAO;
import com.practice.webapp.dao.PastPaperDAO;
import com.practice.webapp.dao.QuestionDAO;
import com.practice.webapp.dao.ReferencePaperDAO;
import com.practice.webapp.dao.ScheduleDAO;
import com.practice.webapp.dao.StatisticDAO;
import com.practice.webapp.dao.TestCategoryDAO;
import com.practice.webapp.entity.Form;
import com.practice.webapp.entity.Manager;
import com.practice.webapp.entity.Masterpiece;
import com.practice.webapp.entity.News;
import com.practice.webapp.entity.PastPaper;
import com.practice.webapp.entity.Question;
import com.practice.webapp.entity.ReferencePaper;
import com.practice.webapp.entity.Schedule;
import com.practice.webapp.entity.Statistic;
import com.practice.webapp.entity.Test;




@Controller

public class ManagerController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
		
	@RequestMapping(value = "/Manager_Login", method = RequestMethod.GET)
	public ModelAndView ManagerLoginPage(){
		ModelAndView model = new ModelAndView("Manager_Login");
		Manager account_session = (Manager)context.getBean("account");
		account_session.setManagerAccount("");
		account_session.setManagerPassword("");
		
		return model;
	}
	
	@RequestMapping(value = "/Manager_Index", method = RequestMethod.GET)
	public ModelAndView ManagerIndexPage(){
		ModelAndView model = new ModelAndView("Manager_Index");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}
		
		return model;
	}
	
	@RequestMapping(value = "/Go_to_Manager_Index", method = RequestMethod.GET)
	public ModelAndView ManagerIndexPage(@ModelAttribute Manager manager){
		ModelAndView model = new ModelAndView("Manager_Index");
		ManagerDAO managerDAO = (ManagerDAO)context.getBean("managerDAO");
		boolean check = managerDAO.checkLogin(manager);
		if (check){
			//save username and password in the session bean
			Manager account_session = (Manager)context.getBean("account");
			account_session.setManagerAccount(manager.getManagerAccount());
			account_session.setManagerPassword(manager.getManagerPassword());
			model.addObject("manager", account_session);
			System.out.println("Successful!");
		}
		else{
			model = new ModelAndView("Manager_Login");
			model.addObject("message", "登入失敗");
			System.out.println("failed!");
			//reset username and password in the session bean
			Manager account_session = (Manager)context.getBean("account");
			account_session.setManagerAccount("");
			account_session.setManagerPassword("");
		}	
		
		return model;
	}
	
	@RequestMapping(value = "/Manager_Delete", method = RequestMethod.GET)
	public ModelAndView ManagerDeletePage(){
		ModelAndView model = new ModelAndView("Manager_Delete");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}
		// 管理者測驗項目
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testCategoryList = new ArrayList<Test>();
		testCategoryList = testCategoryDAO.getList();
		model.addObject("testList", testCategoryList);		
		// 管理者消息頁
		TestCategoryDAO testCategory = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testList = new ArrayList<Test>();
		testList = testCategory.getList();
		model.addObject("testList", testList);
		
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		newsList = newsDAO.getAllList();
		model.addObject("newsList", newsList);
		// 管理者考程頁
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getAllList();
		model.addObject("scheduleList", scheduleList);
		// 管理者參考佳作頁
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceList = new ArrayList<Masterpiece>();
		masterpieceList = masterpieceDAO.getAllList();
		model.addObject("masterpieceList", masterpieceList);
		// 管理者參考試題頁
		ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		List<ReferencePaper> referencePaperList = new ArrayList<ReferencePaper>();
		referencePaperList = referencePaperDAO.getList_EL();
		model.addObject("referencePaperList", referencePaperList);	
		// 管理者歷屆試題頁
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperList = new ArrayList<PastPaper>();
		pastPaperList = pastPaperDAO.getAllList();
		model.addObject("pastPaperList", pastPaperList);
		
		PastPaperDAO pastPaperDAOForSearchBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForSearchBarYear = new ArrayList<PastPaper>();
		pastPaperListForSearchBarYear = pastPaperDAOForSearchBarYear.getListForNavBarYear();
		model.addObject("pastPaperListForSearchBarYear", pastPaperListForSearchBarYear);
		// 管理者統計資料頁
		StatisticDAO statisticDAOSearchBar = (StatisticDAO)context.getBean("statisticDAOSearchBar");
		List<Statistic> statisticList = new ArrayList<Statistic>();
		statisticList = statisticDAOSearchBar.getAllList();
        model.addObject("statisticList", statisticList);
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearchBar.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearchBar.getRegionList("0");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);
		// 管理者相關表格頁
		FormDAO formDAO = (FormDAO)context.getBean("formDAO");
		List<Form> formList = new ArrayList<Form>();
		formList = formDAO.getAllList();
		model.addObject("formList", formList);
		// 管理者問題解答頁
		QuestionDAO questionDAO = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionList = new ArrayList<Question>();
		questionList = questionDAO.getAllList();
		model.addObject("questionList", questionList);	
		
		return model;
	}
	
	//delete searchbar
	@RequestMapping(value = "/Manager_Delete_Search_News", method = RequestMethod.GET)
	public ModelAndView ManagerDeletePageSearch(@RequestParam("test") String test,@RequestParam("word") String word,@RequestParam("display") String display,@RequestParam("mes") String mes) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("Manager_Delete");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}
		
		TestCategoryDAO testCategory = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testList = new ArrayList<Test>();
		testList = testCategory.getList();
		model.addObject("testList", testList);
		
		test = new String(test.getBytes("ISO-8859-1"), "utf-8");
		word = new String(word.getBytes("ISO-8859-1"), "utf-8");
		String wordDisplay = "0";
		
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		List<News> newsList = new ArrayList<News>();
		if(test.equals("學測") && word.equals("")){
		newsList = newsDAO.getList("1");
		model.addObject("newsList", newsList);
		}
		else if(test.equals("指考") && word.equals("")){
		newsList = newsDAO.getList("2");
		model.addObject("newsList", newsList);
		}
		else if(test.equals("英聽") && word.equals("")){
		newsList = newsDAO.getList("3");
		model.addObject("newsList", newsList);
		}
		else if(test.equals("其他") && word.equals("")){
			newsList = newsDAO.getList("4");
			model.addObject("newsList", newsList);
			}
		else {
			newsList = newsDAO.getWordList(test,word);
			model.addObject("newsWordList", newsList);
			wordDisplay = "1";
			}
		model.addObject("word", word);
		model.addObject("display", display);
		model.addObject("wordDisplay", wordDisplay);
		
		return model;
	}
	
	
	@RequestMapping(value = "/Manager_Delete_Search_Statistic", method = RequestMethod.GET)
	public ModelAndView SS_Page_statistic(@RequestParam("year") String year,@RequestParam("sortbig") String region,@RequestParam("smallsort") String name,@RequestParam("display") String display,@RequestParam("Test") String Test,@RequestParam("mes") String mes)throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("Manager_Delete");
		year = new String(year.getBytes("ISO-8859-1"), "utf-8");
		region = new String(region.getBytes("ISO-8859-1"), "utf-8");
		name = new String(name.getBytes("ISO-8859-1"), "utf-8");
		Test = new String(Test.getBytes("ISO-8859-1"), "utf-8");
		
		
		
		if(Test.equals("學測")){
			Test = "1";
		}
		else if(Test.equals("指考")){
			Test = "2";
		}
		else if(Test.equals("英聽")){
			Test = "3";
		}
		
		TestCategoryDAO testCategory = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testList = new ArrayList<Test>();
		testList = testCategory.getList();
		model.addObject("testList", testList);
		
		StatisticDAO statisticDAOSearch = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticSearchData = new ArrayList<Statistic>();
        statisticSearchData = statisticDAOSearch.getData(year,region,name,Test);
        model.addObject("statisticSearchData", statisticSearchData);
        
        
        
        // searchbar用(無傳值)
        List<Statistic> statisticSearchBarYear = new ArrayList<Statistic>();
        statisticSearchBarYear = statisticDAOSearch.getYearList();
        model.addObject("statisticSearchBarYear", statisticSearchBarYear);
        List<Statistic> statisticSearchBarRegion = new ArrayList<Statistic>();
        statisticSearchBarRegion = statisticDAOSearch.getRegionList("0");
        model.addObject("statisticSearchBarRegion", statisticSearchBarRegion);
        
        model.addObject("display", display);
        model.addObject("test", Test);
     
		return model;
	}
	
	@RequestMapping(value = "/Manager_Delete_Search_Pastpaper", method = RequestMethod.GET)
	public ModelAndView ManagerDeletePageSearchPastpaper(@RequestParam("display") String display,@RequestParam("mes") String mes,@RequestParam("year") String year) throws UnsupportedEncodingException{
		ModelAndView model = new ModelAndView("Manager_Delete");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}

			PastPaperDAO pastPaperDAOForSearchBarYear = (PastPaperDAO)context.getBean("pastPaperDAO");
			List<PastPaper> pastPaperListForSearchBarYear = new ArrayList<PastPaper>();
			pastPaperListForSearchBarYear = pastPaperDAOForSearchBarYear.getListForNavBarYear();
			model.addObject("pastPaperListForSearchBarYear", pastPaperListForSearchBarYear);
			
			List<PastPaper> pastPaperListForSearch = new ArrayList<PastPaper>();
			pastPaperListForSearch = pastPaperDAOForSearchBarYear.getSearchList(year);
			model.addObject("pastPaperListForSearch", pastPaperListForSearch);
			
			model.addObject("display", display);
		
		return model;
	}
	
	// 管理者刪除
	@RequestMapping(value = "/DeleteWithValues", method = RequestMethod.POST)
	public ModelAndView DeleteWithValues(@RequestParam("id") String id, @RequestParam("formAction") String formAction){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes="+formAction+"");
		if(formAction.equals("test")){
			TestCategoryDAO testCategory = (TestCategoryDAO)context.getBean("testCategoryDAO");
			testCategory.delete(id);
		}
		else if(formAction.equals("testnews")){
			NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
			newsDAO.delete(id);
		}
		else if(formAction.equals("schedule")){
			ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
			scheduleDAO.delete(id);	
		}
		else if(formAction.equals("masterpiece")){
			MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
			masterpieceDAO.delete(id);	
		}
		else if(formAction.equals("referencepaper")){
			ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
			referencePaperDAO.delete(id);	
		}
		else if(formAction.equals("pastpaper")){
			PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
			pastPaperDAO.delete(id);	
		}
		else if(formAction.equals("statistic")){
			StatisticDAO statisticDAO = (StatisticDAO)context.getBean("statisticDAOSearchBar");
			statisticDAO.delete(id);	
		}
		else if(formAction.equals("form")){
			FormDAO formDAO = (FormDAO)context.getBean("formDAO");
			formDAO.delete(id);	
		}
		else if(formAction.equals("question")){
			QuestionDAO questionDAO = (QuestionDAO)context.getBean("questionDAO");
			questionDAO.delete(id);	
		}
		
		return model;
	}
	
	@RequestMapping(value = "/Manager_Add", method = RequestMethod.GET)
	public ModelAndView ManagerAddPage(){
		ModelAndView model = new ModelAndView("Manager_Add");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}
		model.addObject("manager",account_session);
		
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testCategoryList = new ArrayList<Test>();
		testCategoryList = testCategoryDAO.getList();
		model.addObject("testCategoryList", testCategoryList);
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getAllList();
		model.addObject("scheduleList", scheduleList);
		PastPaperDAO pastPaperDAOForDistinctSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForDistinctSubject = new ArrayList<PastPaper>();
		pastPaperListForDistinctSubject = pastPaperDAOForDistinctSubject.getDistinctSubject();
		model.addObject("pastPaperListForDistinctSubject", pastPaperListForDistinctSubject);
		StatisticDAO statisticDAOForDistinctRegion = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticListForDistinctRegion = new ArrayList<Statistic>();
        statisticListForDistinctRegion = statisticDAOForDistinctRegion.getDistinctRegion();
        model.addObject("statisticListForDistinctRegion", statisticListForDistinctRegion);
		
		return model;
	}	
	
	// 新增測驗項目
	@RequestMapping(value = "/Manager_Add_test", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Test test){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=test");
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		testCategoryDAO.insert(test);
		
		return model;
	}	
	// 新增消息
	@RequestMapping(value = "/Manager_Add_testnews", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=testnews");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		newsDAO.insert(news);
		
		return model;
	}
	// 新增時程
	@RequestMapping(value = "/Manager_Add_schedule", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Schedule schedule){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=schedule");
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		scheduleDAO.insert(schedule);
		
		return model;
	}
	// 新增參考佳作
	@RequestMapping(value = "/Manager_Add_masterpiece", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Masterpiece masterpiece){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=masterpiece");
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		masterpieceDAO.insert(masterpiece);
		
		return model;
	}
	// 新增參考試卷
	@RequestMapping(value = "/Manager_Add_referencepaper", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute ReferencePaper referencePaper){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=referencepaper");
		ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		referencePaperDAO.insert(referencePaper);
		
		return model;
	}
	// 新增歷屆試題
	@RequestMapping(value = "/Manager_Add_pastpaper", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute PastPaper pastPaper){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=pastpaper");
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		pastPaperDAO.insert(pastPaper);
		
		return model;
	}
	// 新增統計資料
	@RequestMapping(value = "/Manager_Add_statistic", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Statistic statistic){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=statistic");
		StatisticDAO statisticDAO = (StatisticDAO)context.getBean("statisticDAOSearchBar");
		statisticDAO.insert(statistic);
		
		return model;
	}
	// 新增相關表格
	@RequestMapping(value = "/Manager_Add_form", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Form form){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=form");
		FormDAO formDAO = (FormDAO)context.getBean("formDAO");
		formDAO.insert(form);
		
		return model;
	}
	// 新增問題解答
	@RequestMapping(value = "/Manager_Add_question", method = RequestMethod.POST)
	public ModelAndView ManagerAddPage(@ModelAttribute Question question){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=question");
		QuestionDAO questionDAO = (QuestionDAO)context.getBean("questionDAO");
		questionDAO.insert(question);
		
		return model;
	}
	
	@RequestMapping(value = "/Manager_Update", method = RequestMethod.GET)
	public ModelAndView ManagerUpdatePage(@ModelAttribute Test test, @ModelAttribute News news, @ModelAttribute Schedule schedule, @ModelAttribute Masterpiece masterpiece, @ModelAttribute ReferencePaper referencePaper, @ModelAttribute PastPaper pastPaper, @ModelAttribute Statistic statistic, @ModelAttribute Form form, @ModelAttribute Question question){
		ModelAndView model = new ModelAndView("Manager_Update");
		Manager account_session = (Manager)context.getBean("account");
		if(account_session.getManagerAccount() == null || account_session.getManagerAccount().equals("")){
			model = new ModelAndView("Manager_Login");
		}
		model.addObject("manager",account_session);
		
		//抓測驗項目舊的值
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		test = testCategoryDAO.get(test);
		model.addObject("test", test);
		//抓消息舊的值
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		news = newsDAO.get(news);
		model.addObject("news", news);
		//抓時程舊的值
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		schedule = scheduleDAO.get(schedule);
		model.addObject("schedule", schedule);
		//抓參考佳作舊的值
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		masterpiece = masterpieceDAO.get(masterpiece);
		model.addObject("masterpiece", masterpiece);
		//抓參考試卷舊的值
		ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		referencePaper = referencePaperDAO.get(referencePaper);
		model.addObject("referencePaper", referencePaper);
		//抓歷屆試題舊的值
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		pastPaper = pastPaperDAO.get(pastPaper);
		model.addObject("pastPaper", pastPaper);
		//抓統計資料舊的值
		StatisticDAO statisticDAO = (StatisticDAO)context.getBean("statisticDAOSearchBar");
		statistic = statisticDAO.get(statistic);
		model.addObject("statistic", statistic);
		//抓相關表格舊的值
		FormDAO formDAO = (FormDAO)context.getBean("formDAO");
		form = formDAO.get(form);
		model.addObject("form", form);
		//抓問題解答舊的值
		QuestionDAO questionDAO = (QuestionDAO)context.getBean("questionDAO");
		question = questionDAO.get(question);
		model.addObject("question", question);
		
		
//		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		List<Test> testCategoryList = new ArrayList<Test>();
		testCategoryList = testCategoryDAO.getList();
		model.addObject("testCategoryList", testCategoryList);
//		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		scheduleList = scheduleDAO.getAllList();
		model.addObject("scheduleList", scheduleList);
		PastPaperDAO pastPaperDAOForDistinctSubject = (PastPaperDAO)context.getBean("pastPaperDAO");
		List<PastPaper> pastPaperListForDistinctSubject = new ArrayList<PastPaper>();
		pastPaperListForDistinctSubject = pastPaperDAOForDistinctSubject.getDistinctSubject();
		model.addObject("pastPaperListForDistinctSubject", pastPaperListForDistinctSubject);
		StatisticDAO statisticDAOForDistinctRegion = (StatisticDAO)context.getBean("statisticDAOSearchBar");
        List<Statistic> statisticListForDistinctRegion = new ArrayList<Statistic>();
        statisticListForDistinctRegion = statisticDAOForDistinctRegion.getDistinctRegion();
        model.addObject("statisticListForDistinctRegion", statisticListForDistinctRegion);
        MasterpieceDAO masterpieceDAOForDistinctSubject = (MasterpieceDAO)context.getBean("masterpieceDAO");
		List<Masterpiece> masterpieceListForDistinctSubject = new ArrayList<Masterpiece>();
		masterpieceListForDistinctSubject = masterpieceDAOForDistinctSubject.getDistinctList();
		model.addObject("masterpieceListForDistinctSubject", masterpieceListForDistinctSubject);
		QuestionDAO questionDAOForDistinctDetail = (QuestionDAO)context.getBean("questionDAO");
		List<Question> questionListForDistinctDetail = new ArrayList<Question>();
		questionListForDistinctDetail = questionDAOForDistinctDetail.getDistinctDetail();
		model.addObject("questionListForDistinctDetail", questionListForDistinctDetail);
		ReferencePaperDAO referencePaperDAOForDistinctName = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		List<ReferencePaper> referencePaperListForDistinctName = new ArrayList<ReferencePaper>();
		referencePaperListForDistinctName = referencePaperDAOForDistinctName.getDistinctName();
		model.addObject("referencePaperListForDistinctName", referencePaperListForDistinctName);	
		FormDAO formDAOForDistinctDeatil = (FormDAO)context.getBean("formDAO");
		List<Form> formListForDistinctDeatil = new ArrayList<Form>();
		formListForDistinctDeatil = formDAOForDistinctDeatil.getDistinctDetail();
		model.addObject("formListForDistinctDeatil", formListForDistinctDeatil);
        
		return model;
	}
	
	// 修改測驗項目
	@RequestMapping(value = "/Manager_Update_test", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Test test){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=test");
		TestCategoryDAO testCategoryDAO = (TestCategoryDAO)context.getBean("testCategoryDAO");
		testCategoryDAO.update(test);
		
		return model;
	}
	// 修改消息
	@RequestMapping(value = "/Manager_Update_testnews", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute News news){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=testnews");
		NewsDAO newsDAO = (NewsDAO)context.getBean("newsDAO");
		newsDAO.update(news);
		
		return model;
	}
	// 修改時程
	@RequestMapping(value = "/Manager_Update_schedule", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Schedule schedule){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=schedule");
		ScheduleDAO scheduleDAO = (ScheduleDAO)context.getBean("scheduleDAO");
		scheduleDAO.update(schedule);
		
		return model;
	}
	// 修改參考佳作
	@RequestMapping(value = "/Manager_Update_masterpiece", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Masterpiece masterpiece){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=masterpiece");
		MasterpieceDAO masterpieceDAO = (MasterpieceDAO)context.getBean("masterpieceDAO");
		masterpieceDAO.update(masterpiece);
		
		return model;
	}
	// 修改參考試卷
	@RequestMapping(value = "/Manager_Update_referencepaper", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute ReferencePaper referencePaper){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=referencepaper");
		ReferencePaperDAO referencePaperDAO = (ReferencePaperDAO)context.getBean("referencePaperDAO");
		referencePaperDAO.update(referencePaper);
		
		return model;
	}
	// 修改歷屆試題
	@RequestMapping(value = "/Manager_Update_pastpaper", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute PastPaper pastPaper){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=pastpaper");
		PastPaperDAO pastPaperDAO = (PastPaperDAO)context.getBean("pastPaperDAO");
		pastPaperDAO.update(pastPaper);
		
		return model;
	}
	// 修改統計資料
	@RequestMapping(value = "/Manager_Update_statistic", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Statistic statistic){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=statistic");
		StatisticDAO statisticDAO = (StatisticDAO)context.getBean("statisticDAOSearchBar");
		statisticDAO.update(statistic);
		
		return model;
	}
	// 修改相關表格
	@RequestMapping(value = "/Manager_Update_form", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Form form){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=form");
		FormDAO formDAO = (FormDAO)context.getBean("formDAO");
		formDAO.update(form);
		
		return model;
	}
	// 修改問題解答
	@RequestMapping(value = "/Manager_Update_question", method = RequestMethod.POST)
	public ModelAndView ManagerUpdate(@ModelAttribute Question question){
		ModelAndView model = new ModelAndView("redirect:/Manager_Delete?mes=question");
		QuestionDAO questionDAO = (QuestionDAO)context.getBean("questionDAO");
		questionDAO.update(question);
		
		return model;
	}
	
}