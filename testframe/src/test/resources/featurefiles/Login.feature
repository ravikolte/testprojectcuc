#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
c (Comments)

#Sample Feature Definition Template

Feature: Login to the page


Scenario: Verify the Login Section with valid username and valid password
Given I am at login page
	And Enter UserId
	And Enter Password
Then Click on Login

## Below are manual testing scenrios that are not automated
##Scenario: Verify the Login Section with valid username and invalid password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with invalid username and valid password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with invalid username and invalid password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with blank username and blank password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with blank username and valid password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with blank username and invalid password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with valid username and blank password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login

##Scenario: Verify the Login Section with invalid username and blank password
##  Given I am at login page
##	And Enter UserId
##	And Enter Password
##  Then Click on Login