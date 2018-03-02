package com.testframe.stepdefinition.FundTransfer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.FundTransfer;
import framework.helper.TestBase.TestBase;

public class fundtransfer {

	FundTransfer ft;
	
	@Given("^That I am homepage then click on Fund transfer page$")
	public void that_I_am_homepage_then_click_on_Fund_transfer_page() throws Throwable {
	   ft = new FundTransfer(TestBase.driver);
	   ft.FundTransfer.click();
	}

	@Then("^I Enter Payers Account No \"([^\"]*)\"$")
	public void i_Enter_Payers_Account_No(String payers) throws Throwable {
	    ft.EnterPayersAccount(payers);
	}

	@Then("^I Enter Payees Account No \"([^\"]*)\"$")
	public void i_Enter_Payees_Account_No(String payee) throws Throwable {
	   ft.EnterPayeesAccount(payee);
	}

	@Then("^Enter Amount \"([^\"]*)\"$")
	public void enter_Amount(String amt) throws Throwable {
	    ft.EnterAmount(amt);
	}

	@Then("^I Add the Description \"([^\"]*)\"$")
	public void i_Add_the_Description(String des) throws Throwable {
	    ft.EnterDescription(des);
	}

	@Then("^I will click on Submit button to transfer fund$")
	public void i_will_click_on_Submit_button_to_transfer_fund() throws Throwable {
	    ft.Submit();
	}
	
	@Then("^Verify that Payers Account No \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Payers_Account_No_and_match_actual_result_with_the(String payersaccountno, String expected) throws Throwable {
	   ft.EnterPayersAccountNoAndValidatetheResult(payersaccountno, expected);
	}

	@Then("^Verify that Payees Account No \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Payees_Account_No_and_match_actual_result_with_the(String payeesaccount, String expected) throws Throwable {
	  ft.EnterPayeesAccountNoAndValidatetheResult(payeesaccount, expected);
	}
}
