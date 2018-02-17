package com.testframe.runner.testdraggururunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefiles/dragdrop.feature" }, glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report"})
public class testdragfeaturerunner  extends AbstractTestNGCucumberTests {

}