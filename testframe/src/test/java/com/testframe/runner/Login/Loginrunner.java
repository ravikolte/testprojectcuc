package com.testframe.runner.Login;

import java.util.Properties;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/Login.feature",
		 "classpath:featurefiles/Login.feature",
		 "classpath:featurefiles/newaccount.feature",
		 "classpath:featurefiles/NewCustomer.feature",
},       
        glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" }, plugin = {"html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Ravi\\testprojectcuc\\git\\testframe\\Reports\\report.html"})
public class Loginrunner extends AbstractTestNGCucumberTests {

	@AfterClass
	 public static void reportSetup()
	 {
		Reporter.loadXMLConfig("C:\\Users\\Ravi\\testprojectcuc\\git\\testframe\\extent-config.xml");
		Properties p =System.getProperties();
		p.list(System.out);
	 }
}