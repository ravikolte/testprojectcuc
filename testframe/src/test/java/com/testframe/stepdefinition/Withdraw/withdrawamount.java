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
	
	@Then("^Verify that Account No \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Account_No_and_match_actual_result_with_the(String accountno, String expected) throws Throwable {
	    awf.EnterAccountNoAndValidatetheResult(accountno, expected);
	}

	@Then("^Verify that Amount \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void verify_that_Amount_and_match_actual_result_with_the(String amount, String expected) throws Throwable {
	   awf.EnterAmountAndValidatetheResult(amount, expected);
	}

	
}
