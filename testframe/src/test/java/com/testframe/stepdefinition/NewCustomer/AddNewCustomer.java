package com.testframe.stepdefinition.NewCustomer;

import cucumber.api.java.en.Then;
import framework.PageObject.NewCustomerpage;
import framework.helper.TestBase.TestBase;

public class AddNewCustomer {

	NewCustomerpage ncp= new NewCustomerpage(TestBase.driver); ;
	
	@Then("^Click on NewCustomer$")
	public void click_on_NewCustomer() throws Throwable {
		
		ncp.NewCustomer();
	}

@Then("^I enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_and(String custname, String Gender, String dob, String address, String city, String state, String pin, String mobile, String email, String pass) throws Throwable {

	ncp.AddNewCustomerDetails(custname, Gender, dob, address, city, state, pin, mobile, email, pass);
}
	
	@Then("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
         
		ncp.Submit();

	}
	
}
