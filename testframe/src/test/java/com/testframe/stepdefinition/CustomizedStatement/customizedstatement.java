package com.testframe.stepdefinition.CustomizedStatement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.CustomizedStatementForm;
import framework.helper.TestBase.TestBase;

public class customizedstatement {
 
	CustomizedStatementForm csf;
	
	@Given("^That I am homepage then click on Customised Statement$")
	public void that_I_am_homepage_then_click_on_Customised_Statement() throws Throwable {
	   csf = new CustomizedStatementForm(TestBase.driver);
	   csf.CustomisedStatement.click();
	}

	@Then("^I Enter details to change password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_Enter_details_to_change_password(String AccountNo, String Fromdate, String ToDate, String MinimumTransactionvalue, String NumberofTransactions) throws Throwable {
	    csf.EnterDetailsforStatement(AccountNo, Fromdate, ToDate, MinimumTransactionvalue, NumberofTransactions);
	}

	@Then("^I Click on Submit button on Customized Statemen form$")
	public void i_Click_on_Submit_button_on_Customized_Statemen_form() throws Throwable {
	   csf.Submit();
	}
	
	@Then("^Verify that Minimum Transaction Value \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Minimum_Transaction_Value_and_match_actual_result_with_the(String mintrasacvalue, String expected) throws Throwable {
	   csf.EnterMinimumTransactionvalueAndValidatetheResult(mintrasacvalue, expected);
	}

	@Then("^Verify that Number of Transaction \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Number_of_Transaction_and_match_actual_result_with_the(String nooftransacations, String expected) throws Throwable {
	  csf.EnterNumberofTransactionsAndValidatetheResult(nooftransacations, expected);
	}

}
