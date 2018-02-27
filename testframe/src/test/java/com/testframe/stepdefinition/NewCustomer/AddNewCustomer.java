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
	
	@Then("^I enter \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
	public void i_enter_and_match_actual_result_with_the(String customername, String expectedresult) throws Throwable {
	    ncp.EnterCustomerNameAndValidatetheResult(customername, expectedresult);
	}
	
	@Then("^Verify that male option is selected by default$")
	public void verify_that_male_option_is_selected_by_default() throws Throwable {
	   ncp.verifymaleisSelected();
	}
	

@Then("^Verify that Address text area \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_that_Address_text_area_and_match_actual_result_with_the(String address, String expected) throws Throwable {
   ncp.EnterAddressAndValidatetheResult(address, expected);
}

@Then("^Verify that City field \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_City_field_and_match_actual_result_with_the(String city, String expected) throws Throwable {
   ncp.EnterCityAndValidatetheResult(city, expected);
}

@Then("^Verify that State field \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_State_field_and_match_actual_result_with_the(String state, String expected) throws Throwable {
   ncp.EnterStateAndValidatetheResult(state, expected);
}

@Then("^Verify that PIN field \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_PIN_field_and_match_actual_result_with_the(String pin, String expected) throws Throwable {
    ncp.EnterPINAndValidatetheResult(pin, expected);
}

@Then("^Verify that Mobilenumber field \"([^\"]*)\" and match actual result with the \"([^\"]*)\"$")
public void verify_Mobilenumber_field_and_match_actual_result_with_the(String mobile, String expected) throws Throwable {
   ncp.EnterMobileAndValidatetheResult(mobile, expected);
}


}
