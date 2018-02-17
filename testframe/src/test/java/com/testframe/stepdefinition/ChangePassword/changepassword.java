package com.testframe.stepdefinition.ChangePassword;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.ChangePassword;
import framework.helper.TestBase.TestBase;

public class changepassword {

	ChangePassword cp;
	
	@Given("^That I am homepage then click on Change Password$")
	public void that_I_am_homepage_then_click_on_Change_Password() throws Throwable {
	    cp=new ChangePassword(TestBase.driver);
	    cp.ChangePassword.click();
	}

	@Then("^I Enter details to change password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_Enter_details_to_change_password(String OldPassword, String NewPassword, String ConfirmPassword) throws Throwable {
	   cp.Changemypassword(OldPassword, NewPassword, ConfirmPassword);
	}

	@Then("^I Click on Submit button on change password form$")
	public void i_Click_on_Submit_button_on_change_password_form() throws Throwable {
	    cp.Submit();
	}
}
