package com.scripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.base.BaseTestScript;
import com.pageobject.PracticeFormPage;

public class PracticeForm extends BaseTestScript{

	Logger logger = Logger.getLogger(PracticeForm.class);
	
	@Test()
	public void scenario01()
	{
		logger.info("Step-1");
		PracticeFormPage page  = new PracticeFormPage();
		logger.info("Step-2");
		page.sendFirstName("Deepak");
		logger.info("Step-3");
		page.sendLastName("Rathod");
		logger.info("Step-4");
		page.selectSex("Male");
		logger.info("Step-5");
		page.selectExprience(7);
	}
	
	@Test()
	public void scenario02()
	{
		logger.info("Step-1");
		PracticeFormPage page  = new PracticeFormPage();
		logger.info("Step-2");
		page.sendFirstName("ABC");
		logger.info("Step-3");
		page.sendLastName("Rathod");
		logger.info("Step-4");
		page.selectSex("Male");
		logger.info("Step-5");
		page.selectExprience(7);
	}
	
	@Test()
	public void scenario03()
	{
		logger.info("Step-1");
		PracticeFormPage page  = new PracticeFormPage();
		logger.info("Step-2");
		page.sendFirstName("XYZ");
		logger.info("Step-3");
		page.sendLastName("Rathod");
		logger.info("Step-4");
		page.selectSex("Male");
		logger.info("Step-5");
		page.selectExprience(7);
	}
}
