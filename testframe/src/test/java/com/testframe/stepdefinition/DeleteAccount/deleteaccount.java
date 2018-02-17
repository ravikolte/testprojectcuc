package com.testframe.stepdefinition.DeleteAccount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.DeleteAccountForm;
import framework.helper.TestBase.TestBase;

public class deleteaccount {

	DeleteAccountForm daf;
	
	@Given("^That I am homepage then click on Delete Account Form$")
	public void that_I_am_homepage_then_click_on_Delete_Account_Form() throws Throwable {
	   daf = new DeleteAccountForm(TestBase.driver);
	   daf.DeleteAccount.click();
	}

	@Then("^I Enter the \"([^\"]*)\"$")
	public void i_Enter_the(String accountno) throws Throwable {
      daf.AccountNumber(accountno);

	}

	@Then("^I Click on Submit button on Delete Account form$")
	public void i_Click_on_Submit_button_on_Delete_Account_form() throws Throwable {
     daf.Submit();

	}

}
