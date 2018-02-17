package com.testframe.runner.FundTransfer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/fundtransfer.feature" }, glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class fundtransferrunner extends AbstractTestNGCucumberTests {

}