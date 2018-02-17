package com.testframe.stepdefinition.EditAccount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.PageObject.EditAccountForm;
import framework.helper.TestBase.TestBase;

public class Editaccount {

	EditAccountForm eaf;
	
	@Given("^that I am on homepage and click on Edit Account$")
	public void that_I_am_on_homepage_and_click_on_Edit_Account() throws Throwable {
	    eaf = new EditAccountForm(TestBase.driver);
	    eaf.EditAccount.click();
	}

	@Then("^I Enter the Account No \"([^\"]*)\"$")
	public void i_Enter_the_Account_No(String accno) throws Throwable {
	   eaf.EnterAccountNumber(accno);
	}

	@Then("^I Click on Submit button$")
	public void i_Click_on_Submit_button() throws Throwable {
	   eaf.Submit();
	}

	@When("^I am on the Edit Acount Entry form and change the type of account \"([^\"]*)\"$")
	public void i_am_on_the_Edit_Acount_Entry_form_and_change_the_type_of_account(String accountype) throws Throwable {
	    eaf.changeaccountype(accountype);
	}

}
