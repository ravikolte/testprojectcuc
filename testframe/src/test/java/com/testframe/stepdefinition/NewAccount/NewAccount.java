package com.testframe.stepdefinition.NewAccount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.NewAccountForm;
import framework.helper.TestBase.TestBase;

public class NewAccount {

	NewAccountForm naf;

@Given("^I am on homepage and click on New Account$")
public void i_am_on_homepage_and_click_on_New_Account() throws Throwable {
   naf = new NewAccountForm(TestBase.driver);
   naf.NewAccount.click();
}

@Then("^I Enter Customer Id \"([^\"]*)\"$")
public void i_Enter_Customer_Id(String custid) throws Throwable {
   naf.EnterCustomerId(custid);
}

@Then("^I select Account type \"([^\"]*)\"$")
public void i_select_Account_type(String acctype) throws Throwable {
    naf.EnterAccountType(acctype);
}

@Then("^Enter the Initial deposit amount \"([^\"]*)\"$")
public void enter_the_Initial_deposit_amount(String indeposit) throws Throwable {
   naf.EnterInitialDeposit(indeposit);
}

@Then("^I click on Submit button on New Account form$")
public void i_click_on_Submit_button_on_New_Account_form() throws Throwable {
    naf.Submit();
}

@Then("^Verify that Savings option is selected by default$")
public void verify_that_Savings_option_is_selected_by_default() throws Throwable {
    naf.CheckAccounttype();
}

@Then("^Verify that Customer Id \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_that_Customer_Id_and_match_actual_result_with_the(String custid, String expected) throws Throwable {
    naf.EnterCustomerIdAndValidatetheResult(custid, expected);
}

@Then("^Verify that Initial Deposit \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_that_Initial_Deposit_and_match_actual_result_with_the(String initaldeposit, String expected) throws Throwable {
  naf.EnterInitialAndValidatetheResult(initaldeposit, expected);
}


}
