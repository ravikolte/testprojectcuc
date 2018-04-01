package com.testframe.runner.Login;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefiles/Login.feature",
		 "classpath:featurefiles/Login.feature",
		 "classpath:featurefiles/newaccount.feature",
		 "classpath:featurefiles/NewCustomer.feature",
},       
        glue = {
		"classpath:com.testframe.stepdefinition",
		"classpath:framework.helper" })
public class Loginrunner extends AbstractTestNGCucumberTests {

	 }
