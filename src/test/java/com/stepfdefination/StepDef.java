package com.stepfdefination;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	@Given("^browser should open$")
	public void browser_should_open() throws Throwable {
		System.out.println("Browser is open now");
	}

	@When("^Enter login username and password$")
	public void enter_login_username_and_password() throws Throwable {
		System.out.println("Enter username as : deepak and password as 123");
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		System.out.println("Automation going to click on login button");
	}

	@Then("^verify result$")
	public void verify_result() throws Throwable {
		Assert.assertTrue(false);
		System.out.println("Verification done for login successful");
	}

	@When("^Enter login \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_login_and(String username, String password) throws Throwable {
		System.out.println("Login with username as "+username+" Password as "+password);
	}
	
}
