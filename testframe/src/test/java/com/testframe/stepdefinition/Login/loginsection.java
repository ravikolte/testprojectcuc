package com.testframe.stepdefinition.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.Login;
import framework.configreader.ObjectRepo;
import framework.helper.TestBase.TestBase;

public class loginsection {

	Login log;
	TestBase tb;
	
	
	
	@Given("^I am at login page$")
	public void i_am_at_login_page() throws Throwable {
		tb = new TestBase();
		tb.before();
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@Given("^Enter UserId$")
	public void enter_UserId() throws Throwable {
		log= new Login(TestBase.driver);
		log.EnterUserId();
	}

	@Given("^Enter Password$")
	public void enter_Password() throws Throwable {
	    log.EnterPassword();
	}

	@Then("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    log.ClickonLoginbtn();
	    
	}
	
	
}
