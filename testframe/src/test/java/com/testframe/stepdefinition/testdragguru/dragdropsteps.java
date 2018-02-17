package com.testframe.stepdefinition.testdragguru;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.PageObject.dragdropguru99;
import framework.configreader.ObjectRepo;
import framework.helper.TestBase.TestBase;

public class dragdropsteps {

	dragdropguru99 dragdroppage;
	

	@Given("^I am at the guru dragdrop webpage$")
	public void i_am_at_the_guru_dragdrop_webpage() throws Throwable {
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	}

	@Given("^Add Bank to Debit side account$")
	public void add_Bank_to_Debit_side_account() throws Throwable {
		dragdroppage= new dragdropguru99(TestBase.driver);
	   dragdroppage.AddDebitsideAccount();
	}

	@Then("^Add Fivethousand to Debit side amount$")
	public void add_Fivethousand_to_Debit_side_amount() throws Throwable {
	    dragdroppage.AddDebitsideAmount();
	}

	@Then("^Add Sales to Credit side account$")
	public void add_Sales_to_Credit_side_account() throws Throwable {
	    dragdroppage.AddCreditssideAccount();
	}

	@Then("^Add FiveThousand to Credit side amount$")
	public void add_FiveThousand_to_Credit_side_amount() throws Throwable {
	    dragdroppage.AddCreditsideAmount();
	}
	
}
