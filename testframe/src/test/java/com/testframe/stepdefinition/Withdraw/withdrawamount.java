package com.testframe.stepdefinition.Withdraw;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.AmountWithdrawalForm;
import framework.helper.TestBase.TestBase;

public class withdrawamount {
 
	AmountWithdrawalForm awf;
	
	@Given("^That I am homepage then click on Withdrawal$")
	public void that_I_am_homepage_then_click_on_Withdrawal() throws Throwable {
		awf = new AmountWithdrawalForm(TestBase.driver);
	    awf.Withdrawal.click();
	}

	@Then("^I Enter withdrawal details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_Enter_withdrawal_details(String AccountNo, String Amount, String Description) throws Throwable {
	    awf.WithdrawalDetails(AccountNo, Amount, Description);
	}

	@Then("^I Click on Submit button on Withdrawal form$")
	public void i_Click_on_Submit_button_on_Withdrawal_form() throws Throwable {
	    awf.Submit();
	}
	
}
