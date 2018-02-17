package com.testframe.runner.Withdraw;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/amountwithdrawal.feature" }, glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class withdrawamountrunner extends AbstractTestNGCucumberTests {

}