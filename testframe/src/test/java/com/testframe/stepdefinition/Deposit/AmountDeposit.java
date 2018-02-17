package com.testframe.stepdefinition.Deposit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.AmountDepositForm;
import framework.helper.TestBase.TestBase;

public class AmountDeposit {

	AmountDepositForm adf;
	
	@Given("^That I am homepage then click on Deposit$")
	public void that_I_am_homepage_then_click_on_Deposit() throws Throwable {
		adf= new AmountDepositForm(TestBase.driver);
		adf.Deposit.click();
	}

	@Then("^I Enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_Enter(String AccountNo, String Amount, String Description) throws Throwable {
	     adf.EnterAmountDepositDetails(AccountNo, Amount, Description);
	}

	@Then("^I Click on Sumbit button$")
	public void i_Click_on_Sumbit_button() throws Throwable {
	    adf.Submit();
	}
}
