package com.testframe.stepdefinition.editcustomer;

import cucumber.api.java.en.Then;
import framework.PageObject.Editcustomerformpage;
import framework.helper.TestBase.TestBase;

public class EditCustomerform {

	
	Editcustomerformpage edit= new Editcustomerformpage(TestBase.driver);

	
	
	@Then("^Click on EditCustomer$")
	public void click_on_EditCustomer() throws Throwable {
		
		edit.EditCustomer();
		
	}

	@Then("^Enter \"([^\"]*)\"$")
	public void enter(String custid) throws Throwable {
	   edit.entercustomerid(custid);
	   
	   
	}
	
	@Then("^Click on Submit button on edit page$")
	public void click_on_submit_button_on_edit_page() throws Throwable {
	  edit.Submit();
	}


}
