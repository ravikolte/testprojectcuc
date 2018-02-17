package com.testframe.stepdefinition.MiniStatement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.MiniStatementForm;
import framework.helper.TestBase.TestBase;

public class MiniStatement {

	MiniStatementForm msf;
	
	@Given("^That I am at homepage then click on Mini Statement$")
	public void that_I_am_at_homepage_then_click_on_Mini_Statement() throws Throwable {
	   msf=new MiniStatementForm(TestBase.driver);
	   msf.MiniStatement.click();
	}

	@Then("^I Enter Account number \"([^\"]*)\"$")
	public void i_Enter_Account_number(String accountno) throws Throwable {
	   msf.AccountNumber(accountno);
	}

	@Then("^I Click on Submit button on Mini Statement form$")
	public void i_Click_on_Submit_button_on_Mini_Statement_form() throws Throwable {
	    msf.Submit();
	}

}
