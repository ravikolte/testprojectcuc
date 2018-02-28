package com.testframe.runner.NewCustomer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/NewCustomer.feature" }, glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report"},
		tags ={"@SmokeTest"})
public class newcustomerrunner extends AbstractTestNGCucumberTests {

}