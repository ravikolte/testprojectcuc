package com.testframe.runner.DeleteCustomer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/deletecustomer.feature" }, glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class DeleteCustomeRunner extends AbstractTestNGCucumberTests {

}