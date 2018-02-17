package com.testframe.stepdefinition.DeleteCustomer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.DeleteCustomerForm;
import framework.helper.TestBase.TestBase;

public class DeleteCustomer {

	DeleteCustomerForm dcf;
	
	@Given("^That I am homepage then click on Delete Customer Form$")
	public void that_I_am_homepage_then_click_on_Delete_Customer_Form() throws Throwable {
	    dcf = new DeleteCustomerForm(TestBase.driver);
	    dcf.DeleteCustomer.click();
	}

	@Then("^I Enter the \"([^\"]*)\" of the customer that needs to be deleted$")
	public void i_Enter_the_of_the_customer_that_needs_to_be_deleted(String custid) throws Throwable {
	    dcf.EnterCustomerId(custid);
	}

	@Then("^I Click on Submit button on Delete Customer form$")
	public void i_Click_on_Submit_button_on_Delete_Customer_form() throws Throwable {
	    dcf.Submit();
	}

	
	
}
