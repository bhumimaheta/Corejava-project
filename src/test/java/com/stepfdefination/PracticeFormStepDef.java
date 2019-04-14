package com.stepfdefination;

import com.base.BaseTestScript;
import com.pageobject.PracticeFormPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeFormStepDef extends BaseTestScript{
	
	PracticeFormPage page;
	@Before
	public void before()
	{
		System.out.println("This will execute before executing feafure file steps");
	}
	
	@Given("^Browser should open$")
	public void opebBrowser() throws Throwable {
		beforeSuite();
		page = new PracticeFormPage();
	}

	@When("^Page should be loaded$")
	public void pageLoad() throws Throwable {
		beforeTest();
	}

	@When("^Enter firstname as \"([^\"]*)\"$")
	public void setFirstName(String firstName) throws Throwable {
		page.sendFirstName(firstName);
	}

	@When("^Enter lastname as \"([^\"]*)\"$")
	public void setLastName(String lastName) throws Throwable {
		page.sendLastName(lastName);
	}

	@When("^Enter Geneder as \"([^\"]*)\"$")
	public void setGender(String gender) throws Throwable {
		page.selectSex(gender);
	}

	@When("^Enter Year of exprience (\\d+)$")
	public void setExprience(int years) throws Throwable {
		page.selectExprience(years);
	}

	@When("^Enter Profession as \"([^\"]*)\"$")
	public void setProfession(String profession) throws Throwable {
		page.selectProfession(profession);
	}

	@When("^Enter current date$")
	public void setCurrentDate() throws Throwable {
		page.setDate(null);
	}
	
	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		afterSuite();
	}
}
